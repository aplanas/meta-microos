SUMMARY = "Access to 150 paragraphs of Lorem Fistrum very dummy text"
DESCRIPTION = "Fistrum is a LaTeX package forked from lipsum that produces \
dummy text for use in documents and examples. The paragraphs \
were taken with permission from https://www.chiquitoipsum.com/. \
Fistrum es un paquete de LaTeX derivado de lipsum que produce \
texto de ejemplo para usarlo en documentos y ejemplos. Los \
parrafos se han tomado con permiso de \
https://www.chiquitoipsum.com/."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn66461"

RPM_NAME = "texlive-fistrum-2023.209.0.0.1svn66461-53.1.noarch.rpm"
RPM_HASH = "f911b521146c0228cb2f5f6af90dc251b5d851612f2415d566a3e9f3ffb91870616e7604bfb2c6557cf03743b14b3eaa8ea1de2d549a6dba46d75c26cfafa9aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fistrum.sty \
texlive-fistrum"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-l3keys2e.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
