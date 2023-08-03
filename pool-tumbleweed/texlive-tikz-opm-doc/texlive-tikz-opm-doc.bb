SUMMARY = "Documentation for texlive-tikz-opm"
DESCRIPTION = "This package includes the documentation for texlive-tikz-opm"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.1svn32769"

RPM_NAME = "texlive-tikz-opm-doc-2023.209.0.0.1.1svn32769-53.1.noarch.rpm"
RPM_HASH = "1d9d6e4d02c125c375e1af8cda13ebb0f2e3565f70645a701e292b2898fb0d71913073f2ff8c7889653d91ec98b3bce6447a83efe19ff4586e059a51b0298035"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-opm-doc"

RDEPENDS:${PN} += ""

inherit rpm
