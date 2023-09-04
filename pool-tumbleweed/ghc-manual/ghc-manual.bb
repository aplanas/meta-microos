SUMMARY = "GHC manual"
DESCRIPTION = "This package provides the User Guide and Haddock manual."
LICENSE = "BSD-3-Clause"

PV = "9.4.6"

RPM_NAME = "ghc-manual-9.4.6-1.1.noarch.rpm"
RPM_HASH = "16560d9b5acd12cf1f10fb3ec273098e09ae5a233d436cbd69c0b592d2a1b69a92d7eaeea89994dd9720e0c93f96da9875005e88db30071a586f70f3ce3f193e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-manual"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
