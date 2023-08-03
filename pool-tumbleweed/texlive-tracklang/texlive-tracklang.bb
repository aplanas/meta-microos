SUMMARY = "Language and dialect tracker"
DESCRIPTION = "The tracklang package is provided for package developers who \
want a simple interface to find out which languages the user \
has requested through packages such as babel or polyglossia. \
This package does not provide any translations! Its purpose is \
simply to track which languages have been requested by the \
user. Generic TeX code is in tracklang.tex for non-LaTeX users."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6.1svn65263"

RPM_NAME = "texlive-tracklang-2023.209.1.6.1svn65263-53.1.noarch.rpm"
RPM_HASH = "760b49aac6ae9e1ace95b4409b4274cc4d17dff3ce6ac8c96c74edb7f8ccf0c7e37a91234f962df2521e374dc63c82f5855fab5e8c7a8957b5dd39cfb4e00bf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tracklang-region-codes.tex \
tex-tracklang-scripts.sty \
tex-tracklang-scripts.tex \
tex-tracklang.sty \
tex-tracklang.tex \
texlive-tracklang"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
