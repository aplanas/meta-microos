SUMMARY = "Define simple macros for greek letters"
DESCRIPTION = "The package defines macros using SS to type greek letters so \
that the user may (for example) type SSa to get the effect of \
$\\alpha$. However, it takes care only of letters which have a \
macro name like \\alpha or \\Omega."
LICENSE = "LPPL-1.0"

PV = "2023.209.5.0.2svn59228"

RPM_NAME = "texlive-paresse-2023.209.5.0.2svn59228-52.1.noarch.rpm"
RPM_HASH = "a844319d93d86943de88010f49193720c4eed9a5d02445a9d2d8a90c7452edb3815296e6b5f88fe995b7e081502b6050485ac06e6d14f6bc197c651cf59a956b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-paresse-old.sty \
tex-paresse-utf8.sty \
tex-paresse.sty \
texlive-paresse"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-iftex.sty \
tex-l3keys2e.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
