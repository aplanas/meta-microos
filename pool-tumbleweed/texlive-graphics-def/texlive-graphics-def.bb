SUMMARY = "Colour and graphics option files"
DESCRIPTION = "This bundle is a combined distribution consisting of dvips.def, \
pdftex.def, luatex.def, xetex.def, dvipdfmx.def, and \
dvisvgm.def driver option files for the LaTeX graphics and \
color packages. It is hoped that by combining their source \
repositories at https://github.com/latex3/graphics-def it will \
be easier to coordinate updates."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn64487"

RPM_NAME = "texlive-graphics-def-2023.201.svn64487-53.1.noarch.rpm"
RPM_HASH = "542998fcbb2f56df338ec7a0fcf358243a9f3f98dfaa1d6c7b50ce13b51462f2c96ec7db0dd96a644d3ee81c1866053f807b08b1a98edd082945b2fefdca60af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(dvipdfmx.def) \
tex(dvips.def) \
tex(dvisvgm.def) \
tex(luatex.def) \
tex(pdftex.def) \
tex(xetex.def) \
texlive-graphics-def"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(epstopdf-base.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
