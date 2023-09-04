SUMMARY = "Slovenian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Slovenian in T1/EC and UTF-8 \
encodings."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58652"

RPM_NAME = "texlive-hyphen-slovenian-2023.209.svn58652-54.1.noarch.rpm"
RPM_HASH = "17f21fabaa41da5d39cbf0954c45b082d06d19aa484308505910b85caae9db38eb124ec13b9cc7e67554eae09130ae9de3853aafc99cc10a1a9be0a094fc2dfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-sl.ec.tex \
tex-hyph-sl.tex \
tex-loadhyph-sl.tex \
texlive-hyphen-slovenian"

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
