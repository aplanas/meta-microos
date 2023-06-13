SUMMARY = "Portuguese hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Portuguese in T1/EC and UTF-8 \
encodings."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58609"

RPM_NAME = "texlive-hyphen-portuguese-2023.201.svn58609-52.1.noarch.rpm"
RPM_HASH = "3bbae1ff4abba43e3a89bc2fcc78bfcbd0faabe4c031dcdd989edeea2cb4f76c95930c014729dffbee2335a54002adb90706a4b0a173ead41e72658b18d7faf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hyph-pt.ec.tex) \
tex(hyph-pt.tex) \
tex(loadhyph-pt.tex) \
texlive-hyphen-portuguese"

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
