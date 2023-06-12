SUMMARY = "Language and dialect tracker"
DESCRIPTION = "The tracklang package is provided for package developers who \
want a simple interface to find out which languages the user \
has requested through packages such as babel or polyglossia. \
This package does not provide any translations! Its purpose is \
simply to track which languages have been requested by the \
user. Generic TeX code is in tracklang.tex for non-LaTeX users."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6.1svn65263"

RPM_NAME = "texlive-tracklang-2023.201.1.6.1svn65263-52.1.noarch.rpm"
RPM_HASH = "9042af1828cc1fb397d9c69d66964e80acbfda343ef109a7f5fe3ec72a77ba55dc1d9e4f830153c77d726e51751c6876032a76223095b4345669b236e29c2f97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tracklang-region-codes.tex) \
tex(tracklang-scripts.sty) \
tex(tracklang-scripts.tex) \
tex(tracklang.sty) \
tex(tracklang.tex) \
texlive-tracklang"
RDEPENDS:${PN} += "/bin/sh \
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
