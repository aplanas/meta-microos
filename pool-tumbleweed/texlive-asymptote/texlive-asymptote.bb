SUMMARY = "2D and 3D TeX-Aware Vector Graphics Language"
DESCRIPTION = "Asymptote is a powerful descriptive vector graphics language \
for technical drawing, inspired by MetaPost but with an \
improved C++-like syntax. Asymptote provides for figures the \
same high-quality level of typesetting that LaTeX does for \
scientific text."
LICENSE = "LGPL-3.0-or-later"

PV = "2023.209.2.85svn65952"

RPM_NAME = "texlive-asymptote-2023.209.2.85svn65952-54.1.noarch.rpm"
RPM_HASH = "1b94d6d852ebc7cd8901dc2c5f0d22c29a6b5cbfe7dcb8b16d4297fd00590e32000c706619a7c951b6e91b8fd2dd180c3bac99bc8622a09bec947cc5b70ac9fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-asycolors.sty \
tex-asymptote.sty \
tex-colo-asy.tex \
tex-ocg.sty \
texlive-asymptote"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
python3-tk \
sed \
tex-catchfile.sty \
tex-color.sty \
tex-graphicx.sty \
tex-ifpdf.sty \
tex-ifthen.sty \
tex-ifxetex.sty \
tex-keyval.sty \
texlive \
texlive-asymptote-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-media9 \
texlive-movie15 \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
