SUMMARY = "French hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for French in T1/EC and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58652"

RPM_NAME = "texlive-hyphen-french-2023.201.svn58652-52.1.noarch.rpm"
RPM_HASH = "0a2f88baa2d21e069c5c466e79260d9a580b6d40b2913aa3048f16b6582dbd1c67438035834045350aa9904fed7e2c3125acd6ecbdfa6a2b921bbb1539323111"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hyph-fr.ec.tex) \
tex(hyph-fr.tex) \
tex(hyph-quote-fr.tex) \
tex(loadhyph-fr.tex) \
texlive-hyphen-french"

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
