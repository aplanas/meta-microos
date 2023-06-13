SUMMARY = "Irish hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Irish (Gaeilge) in T1/EC and UTF-8 \
encodings."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58609"

RPM_NAME = "texlive-hyphen-irish-2023.201.svn58609-52.1.noarch.rpm"
RPM_HASH = "670cc739fa9227744694d453b4dfcb3574df261a9be52ffdcd6761ea492e44f9d8f6135779f82ab3e6803715931ff2e8cf47058fa054e7370df8fefd6aef5219"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hyph-ga.ec.tex) \
tex(hyph-ga.tex) \
tex(loadhyph-ga.tex) \
texlive-hyphen-irish"

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
