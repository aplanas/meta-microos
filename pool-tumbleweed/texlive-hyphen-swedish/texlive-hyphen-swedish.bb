SUMMARY = "Swedish hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Swedish in T1/EC and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58652"

RPM_NAME = "texlive-hyphen-swedish-2023.209.svn58652-54.1.noarch.rpm"
RPM_HASH = "0018279003d697ce71d13787b17ceaeaf0ff46da046d4b66d3581680e2499f8557a047ce30fbc5a71100ac850e9e0033817bb587150f304ce954157a0ffec707"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-sv.ec.tex \
tex-hyph-sv.tex \
tex-loadhyph-sv.tex \
texlive-hyphen-swedish"

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
