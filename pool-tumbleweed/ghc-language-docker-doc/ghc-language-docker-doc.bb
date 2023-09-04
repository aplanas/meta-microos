SUMMARY = "Haskell language-docker library documentation"
DESCRIPTION = "This package provides the Haskell language-docker library documentation."
LICENSE = "GPL-3.0-or-later"

PV = "11.0.0"

RPM_NAME = "ghc-language-docker-doc-11.0.0-1.10.noarch.rpm"
RPM_HASH = "4ddc88a8a8e3e2d7dbafc159637a8cb07d6def14d23c60af9ef3354fb6f6b95d17b6e0de7fb9afc577f5b40b8881cc572dd642b3f1f71a6a8614166c9501d1f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-language-docker-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
