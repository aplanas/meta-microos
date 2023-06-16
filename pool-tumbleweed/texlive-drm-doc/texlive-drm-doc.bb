SUMMARY = "Documentation for texlive-drm"
DESCRIPTION = "This package includes the documentation for texlive-drm"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.4svn38157"

RPM_NAME = "texlive-drm-doc-2023.201.4.4svn38157-52.1.noarch.rpm"
RPM_HASH = "3df2980961c7ada0a354846625265cc3d06b93df27edcbf5fc7a00cafd569d82c751fbcc33a52c6cbea9e73d9ee243380733ce6ca4a5139fbdd4536d116fad1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-drm-doc"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/fontforge \
/usr/bin/sh"

inherit rpm
