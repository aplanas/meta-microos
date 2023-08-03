SUMMARY = "Typeset a resume both in English and Chinese"
DESCRIPTION = "A LaTeX document class to typeset a resume or CV both in \
English and Chinese with more ease and flexibility."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4.1svn54815"

RPM_NAME = "texlive-resumecls-2023.209.0.0.4.1svn54815-54.1.noarch.rpm"
RPM_HASH = "931656d18039c3491b995995c4979532c6b3cad2a363ccddcceb9e15708e45d000f203611a4a2798a65c0480cf397e728ea218fd5e09ecc870dec90779de9481"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-resumecls.cls \
texlive-resumecls"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-ctexart.cls \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-hyperref.sty \
tex-natbib.sty \
tex-tabularx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
