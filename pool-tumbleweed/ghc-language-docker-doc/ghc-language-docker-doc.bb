SUMMARY = "Haskell language-docker library documentation"
DESCRIPTION = "This package provides the Haskell language-docker library documentation."
LICENSE = "GPL-3.0-or-later"

PV = "11.0.0"

RPM_NAME = "ghc-language-docker-doc-11.0.0-1.7.noarch.rpm"
RPM_HASH = "cc2361fa6b3c06508816a6de35e237ccff078919ab0ca6b148bcce8b255bb58d54020783ab3d63b5cc2a89873a25380b0fe65d4fd12047fc4bf4ac7ad3d0d4d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-language-docker-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
