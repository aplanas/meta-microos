SUMMARY = "Colour and graphics option files"
DESCRIPTION = "This bundle is a combined distribution consisting of dvips.def, \
pdftex.def, luatex.def, xetex.def, dvipdfmx.def, and \
dvisvgm.def driver option files for the LaTeX graphics and \
color packages. It is hoped that by combining their source \
repositories at https://github.com/latex3/graphics-def it will \
be easier to coordinate updates."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn64487"

RPM_NAME = "texlive-graphics-def-2023.209.svn64487-54.1.noarch.rpm"
RPM_HASH = "8640b8e659c1397bb7f26addf46224cc01acf1c25bb01d3ff3d7d945bc4f59f98ff6e1ba1955a77576b507cf54d6432a484ef67f0aefc22fee0dfc0deb40e723"
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
