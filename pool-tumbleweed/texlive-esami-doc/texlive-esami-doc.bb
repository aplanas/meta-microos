SUMMARY = "Documentation for texlive-esami"
DESCRIPTION = "This package includes the documentation for texlive-esami"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.7svn61596"

RPM_NAME = "texlive-esami-doc-2023.209.2.7svn61596-54.1.noarch.rpm"
RPM_HASH = "57c433bd26f7518a5d0cf19c661be5ecd942253af118a1c91cc684e4268222e6f11c76332d600557cc91c6161cdeee96cd6a2407ce9ac682e7715c53b6e12a07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-esami-doc-en;it \
texlive-esami-doc"

RDEPENDS:${PN} += ""

inherit rpm
