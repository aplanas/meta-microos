SUMMARY = "Thai hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Thai in LTH and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58652"

RPM_NAME = "texlive-hyphen-thai-2023.201.svn58652-52.1.noarch.rpm"
RPM_HASH = "05625b9b9be80a96cac8e5b566e4176ede4f5c560d064f5a15d5ae4d96c3d6fa20d2d273beb2e33a8b8d1912482ca414c91c47543180ac7054f3f16c6f6f5620"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hyph-th.lth.tex) \
tex(hyph-th.tex) \
tex(loadhyph-th.tex) \
texlive-hyphen-thai"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(language.dat) \
tex(language.dat.lua) \
tex(language.def) \
texlive \
texlive-filesystem \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
