SUMMARY = "Haskell safe library documentation"
DESCRIPTION = "This package provides the Haskell safe library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3.19"

RPM_NAME = "ghc-safe-doc-0.3.19-4.8.noarch.rpm"
RPM_HASH = "4d41fdac5e3b068cbc5ecec8eedffc87dc01f34376f3507b95f4c17003ca6fe75f9a49056b7760b201732f56ffb862a0a19f9f729e91ebe4371e97f9670b5150"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-safe-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
