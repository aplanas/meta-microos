SUMMARY = "Typesetting tables showing variations of functions"
DESCRIPTION = "This LaTeX package is meant to ease the typesetting of tables \
showing variations of functions as they are used in France."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.8svn63921"

RPM_NAME = "texlive-tabvar-2023.201.1.8svn63921-54.1.noarch.rpm"
RPM_HASH = "b1f626383ee02abe4a9dfac06666ffc24a5cbc8e869fb237c1b70116c9adaaac71e6865b5a450fddd63552204eddd0f772024020bddef42b6bbaa1be6d69f277"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tabvar.cfg \
tex-tabvar.map \
tex-tabvar.sty \
tex-tabvar.tfm \
texlive-tabvar"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-colortbl.sty \
tex-graphicx.sty \
tex-ifpdf.sty \
tex-ifthen.sty \
tex-updmap.cfg \
tex-varwidth.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-tabvar-fonts"

inherit rpm
