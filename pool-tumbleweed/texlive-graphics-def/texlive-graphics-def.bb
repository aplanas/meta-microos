SUMMARY = "Colour and graphics option files"
DESCRIPTION = "This bundle is a combined distribution consisting of dvips.def, \
pdftex.def, luatex.def, xetex.def, dvipdfmx.def, and \
dvisvgm.def driver option files for the LaTeX graphics and \
color packages. It is hoped that by combining their source \
repositories at https://github.com/latex3/graphics-def it will \
be easier to coordinate updates."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn64487"

RPM_NAME = "texlive-graphics-def-2023.201.svn64487-53.2.noarch.rpm"
RPM_HASH = "decb4b6a753b7d1473bfdc6eb77b70b6d91884fdf96ef82db48c2947048d751df4469205b076842546145c31fab0704ee90ca8237e82703e3ec0f444bd221b96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dvipdfmx.def \
tex-dvips.def \
tex-dvisvgm.def \
tex-luatex.def \
tex-pdftex.def \
tex-xetex.def \
texlive-graphics-def"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-epstopdf-base.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
