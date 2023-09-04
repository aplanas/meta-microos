SUMMARY = "Catalan hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Catalan in T1/EC and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58609"

RPM_NAME = "texlive-hyphen-catalan-2023.209.svn58609-54.1.noarch.rpm"
RPM_HASH = "a68fa16f897c7d15180db6a9468ed04fa56576ad329db53091d8977e09cb2155cebff27c89ce2d7518c41f0d76d28656c3b32051153a00bf62439ba68674f3aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-ca.ec.tex \
tex-hyph-ca.tex \
tex-loadhyph-ca.tex \
texlive-hyphen-catalan"

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
