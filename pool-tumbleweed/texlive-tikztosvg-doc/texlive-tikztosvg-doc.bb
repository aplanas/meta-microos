SUMMARY = "Documentation for texlive-tikztosvg"
DESCRIPTION = "This package includes the documentation for texlive-tikztosvg"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.3.0svn60289"

RPM_NAME = "texlive-tikztosvg-doc-2023.209.0.0.3.0svn60289-53.1.noarch.rpm"
RPM_HASH = "5d1c5233347af7c877c591345bf6bf805eb11efe8eb85c3a9e0872268d9de9087d767a6ff502d0b72357b1c668221fba3b9f05d822b25c64aa010638921358bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-tikztosvg.1 \
texlive-tikztosvg-doc"

RDEPENDS:${PN} += ""

inherit rpm
