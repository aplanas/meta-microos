SUMMARY = "Haskell regex-posix library documentation"
DESCRIPTION = "This package provides the Haskell regex-posix library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.96.0.1"

RPM_NAME = "ghc-regex-posix-doc-0.96.0.1-4.1.noarch.rpm"
RPM_HASH = "005f73a1472e1e3f7d689cf34f962679cd3343d2c085eb31c04fb287689bdd33e315b7d0d9a2ed56ef0bc0d41a83ec3c28fad44658b8746570b0736ffc378cc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-regex-posix-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
