SUMMARY = "Haskell cipher-aes library documentation"
DESCRIPTION = "This package provides the Haskell cipher-aes library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.11"

RPM_NAME = "ghc-cipher-aes-doc-0.2.11-4.4.noarch.rpm"
RPM_HASH = "ab0080ab776152337c5e9dcd320f20846ae844dc08a052b538f3f47940887a637112d1a4acfbc126161521cf2dca98cdbb1babf6f61e0702708cb0a3fed21e3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cipher-aes-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
