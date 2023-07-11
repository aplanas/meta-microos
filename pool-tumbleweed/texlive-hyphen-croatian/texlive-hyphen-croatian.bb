SUMMARY = "Croatian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Croatian in T1/EC and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn58652"

RPM_NAME = "texlive-hyphen-croatian-2023.208.svn58652-53.1.noarch.rpm"
RPM_HASH = "0ef703576ce7585b9600e6821d3b3e973e9e815f38623f36457656e987c7454a098269daf9fc395f810e80cb59d9dcd061419c0fc2756ca7fc85610e7ff28424"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-hr.ec.tex \
tex-hyph-hr.tex \
tex-loadhyph-hr.tex \
texlive-hyphen-croatian"

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
