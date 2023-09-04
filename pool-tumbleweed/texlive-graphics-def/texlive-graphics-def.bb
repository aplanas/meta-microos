SUMMARY = "Colour and graphics option files"
DESCRIPTION = "This bundle is a combined distribution consisting of dvips.def, \
pdftex.def, luatex.def, xetex.def, dvipdfmx.def, and \
dvisvgm.def driver option files for the LaTeX graphics and \
color packages. It is hoped that by combining their source \
repositories at https://github.com/latex3/graphics-def it will \
be easier to coordinate updates."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn64487"

RPM_NAME = "texlive-graphics-def-2023.209.svn64487-54.2.noarch.rpm"
RPM_HASH = "407c5009681ff1f39b8909fc5ef0803a0c2d17cc4f7cbe00b9f878b32fb3d4d8184a0a70de8e1c04f668f3859b4fda24d211fdf8414a9fc4df454475a280f64e"
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
