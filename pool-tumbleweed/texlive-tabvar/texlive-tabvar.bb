SUMMARY = "Typesetting tables showing variations of functions"
DESCRIPTION = "This LaTeX package is meant to ease the typesetting of tables \
showing variations of functions as they are used in France."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.8svn63921"

RPM_NAME = "texlive-tabvar-2023.209.1.8svn63921-55.1.noarch.rpm"
RPM_HASH = "5e9ba41d0b243b11d5ea8fecbf85cb234f914992aac8619cdb240ee0e08252434dbfe030ffe3d397954b73deeeac7849468c289424ad5897bb950e779e8bdedf"
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
