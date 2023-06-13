SUMMARY = "Estonian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Estonian in T1/EC and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58652"

RPM_NAME = "texlive-hyphen-estonian-2023.201.svn58652-52.1.noarch.rpm"
RPM_HASH = "213aedeaccfa37a92818612edc90e5a0714b9af59bcef503aeab0079eb6e2d9d74a7db63fe35add35b4dade38f9c6b2449834b808844ea52571056b6e5eec217"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hyph-et.ec.tex) \
tex(hyph-et.tex) \
tex(loadhyph-et.tex) \
texlive-hyphen-estonian"

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
