SUMMARY = "2D and 3D TeX-Aware Vector Graphics Language"
DESCRIPTION = "Asymptote is a powerful descriptive vector graphics language \
for technical drawing, inspired by MetaPost but with an \
improved C++-like syntax. Asymptote provides for figures the \
same high-quality level of typesetting that LaTeX does for \
scientific text."
LICENSE = "LGPL-3.0-or-later"

PV = "2023.201.2.85svn65952"

RPM_NAME = "texlive-asymptote-2023.201.2.85svn65952-53.1.noarch.rpm"
RPM_HASH = "68f12a0084e40f5b6ef334b13e7e350a6f7f0519411b503bf88bd7000cd8271c7d2f009d6e7e145495aad6a0d8da6798a1e4fe29e4e7349e0a01955cff1856ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(asycolors.sty) \
tex(asymptote.sty) \
tex(colo-asy.tex) \
tex(ocg.sty) \
texlive-asymptote"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
coreutils \
ed \
findutils \
grep \
python3-tk \
sed \
tex(catchfile.sty) \
tex(color.sty) \
tex(graphicx.sty) \
tex(ifpdf.sty) \
tex(ifthen.sty) \
tex(ifxetex.sty) \
tex(keyval.sty) \
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
