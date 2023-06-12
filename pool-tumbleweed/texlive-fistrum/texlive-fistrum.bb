SUMMARY = "Access to 150 paragraphs of Lorem Fistrum very dummy text"
DESCRIPTION = "Fistrum is a LaTeX package forked from lipsum that produces \
dummy text for use in documents and examples. The paragraphs \
were taken with permission from https://www.chiquitoipsum.com/. \
Fistrum es un paquete de LaTeX derivado de lipsum que produce \
texto de ejemplo para usarlo en documentos y ejemplos. Los \
parrafos se han tomado con permiso de \
https://www.chiquitoipsum.com/."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn66461"

RPM_NAME = "texlive-fistrum-2023.201.0.0.1svn66461-52.1.noarch.rpm"
RPM_HASH = "36cbc0bf5f5410f2a79f88fb82f773020be00b656c186f0020162091c482caec3f7e07131b323b63d5328103c53553471f8b99316ff18f5cbfc47ffcd5e8f602"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(fistrum.sty) \
texlive-fistrum"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(babel.sty) \
tex(l3keys2e.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
