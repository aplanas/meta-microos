SUMMARY = "Haskell ghc-heap library documentation"
DESCRIPTION = "This package provides the Haskell ghc-heap library documentation."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-ghc-heap-doc-9.4.5-3.1.noarch.rpm"
RPM_HASH = "8632b0845e770b2a652900b1568afa8456779940db745682a28bb1b02f5e0afe4d1df6fe5dc3b7f076e6765e2dc6971515a4279641addae3a716848b640c76ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ghc-heap-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
