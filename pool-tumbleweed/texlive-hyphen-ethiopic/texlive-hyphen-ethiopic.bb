SUMMARY = "Hyphenation patterns for Ethiopic scripts"
DESCRIPTION = "Hyphenation patterns for languages written using the Ethiopic \
script for Unicode engines. They are not supposed to be \
linguistically relevant in all cases and should, for proper \
typography, be replaced by files tailored to individual \
languages."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn58652"

RPM_NAME = "texlive-hyphen-ethiopic-2023.208.svn58652-53.1.noarch.rpm"
RPM_HASH = "40d19bd3a825c2162eee5170c529c3023516889e95cca20758381e5f1ac44c6de98ba9a1e9257e94f346bdfdf6dde2d2e0875f6353f099a7241a0974243dfe9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-mul-ethi.tex \
tex-loadhyph-mul-ethi.tex \
texlive-hyphen-ethiopic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
texlive \
texlive-filesystem \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
