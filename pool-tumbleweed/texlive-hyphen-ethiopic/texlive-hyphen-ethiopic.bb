SUMMARY = "Hyphenation patterns for Ethiopic scripts"
DESCRIPTION = "Hyphenation patterns for languages written using the Ethiopic \
script for Unicode engines. They are not supposed to be \
linguistically relevant in all cases and should, for proper \
typography, be replaced by files tailored to individual \
languages."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58652"

RPM_NAME = "texlive-hyphen-ethiopic-2023.201.svn58652-52.1.noarch.rpm"
RPM_HASH = "ccc6b1ff08ea7d739573be76c1ca7e354a6caf760911fa65873f27b90b0236d52f4409c182dec8178b5422a0111efc5ba2f66cdcdfe843e676686c70e5591dc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hyph-mul-ethi.tex) \
tex(loadhyph-mul-ethi.tex) \
texlive-hyphen-ethiopic"

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
