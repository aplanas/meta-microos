SUMMARY = "Template for Huawei documents"
DESCRIPTION = "This unofficial package provides a class for creating documents \
for people working with Huawei Technologies Co., Ltd."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.15.0svn65264"

RPM_NAME = "texlive-huawei-2023.201.0.0.15.0svn65264-52.1.noarch.rpm"
RPM_HASH = "df791d1ba7da379f613437ac4d13edd1d52b9bb934457d80481d6f0b011753fa578b833818e7e66e7238a17c54c9d922b83de5d3494c12d1132fccbbb8366f22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-huawei.cls \
texlive-huawei"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-anyfontsize.sty \
tex-array.sty \
tex-article.cls \
tex-changepage.sty \
tex-currfile.sty \
tex-datetime.sty \
tex-enumitem.sty \
tex-fancyhdr.sty \
tex-fontenc.sty \
tex-fontsize.sty \
tex-footmisc.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-inputenc.sty \
tex-lastpage.sty \
tex-libertine.sty \
tex-makecell.sty \
tex-microtype.sty \
tex-multicol.sty \
tex-pagecolor.sty \
tex-paralist.sty \
tex-ragged2e.sty \
tex-setspace.sty \
tex-svg.sty \
tex-tabularx.sty \
tex-textpos.sty \
tex-tikz.sty \
tex-titling.sty \
tex-wrapfig.sty \
tex-xcolor.sty \
texlive \
texlive-biblatex \
texlive-cjk \
texlive-currfile \
texlive-datetime \
texlive-enumitem \
texlive-fancyhdr \
texlive-filesystem \
texlive-footmisc \
texlive-geometry \
texlive-graphics \
texlive-hyperref \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3packages \
texlive-lastpage \
texlive-libertine \
texlive-makecell \
texlive-microtype \
texlive-minted \
texlive-paralist \
texlive-pgf \
texlive-scripts \
texlive-scripts-bin \
texlive-setspace \
texlive-svg \
texlive-tcolorbox \
texlive-textpos \
texlive-titling \
texlive-tools \
texlive-ulem \
texlive-wrapfig \
texlive-xcolor"

inherit rpm
