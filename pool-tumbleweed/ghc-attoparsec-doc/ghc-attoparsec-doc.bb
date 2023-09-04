SUMMARY = "Haskell attoparsec library documentation"
DESCRIPTION = "This package provides the Haskell attoparsec library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.14.4"

RPM_NAME = "ghc-attoparsec-doc-0.14.4-4.4.noarch.rpm"
RPM_HASH = "26a5a1bf86b07268e8ef23926303e0d6fd4b41bb61b0cdf1bc42ac4c9837a08ab5f415049b87294cdb3066638c3fcb52f0346ede4eb9751a26d0dbe32ed2b948"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-attoparsec-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
