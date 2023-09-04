SUMMARY = "Indonesian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Indonesian (Bahasa Indonesia) in ASCII \
encoding. They are probably also usable for Malay (Bahasa \
Melayu)."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58609"

RPM_NAME = "texlive-hyphen-indonesian-2023.209.svn58609-54.1.noarch.rpm"
RPM_HASH = "1c235b25f34b8b60bb12000997d9f84888e9ae4deb954d5b653de544262eefd137d061197d93b76df5a8091237f7d3ae5a08f69d004fdfeb7ce5fc1c996c7bc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-id.tex \
tex-loadhyph-id.tex \
texlive-hyphen-indonesian"

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
