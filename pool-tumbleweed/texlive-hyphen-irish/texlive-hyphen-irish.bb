SUMMARY = "Irish hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Irish (Gaeilge) in T1/EC and UTF-8 \
encodings."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58609"

RPM_NAME = "texlive-hyphen-irish-2023.209.svn58609-54.1.noarch.rpm"
RPM_HASH = "4cc5b1557dcdfce7981b0411623e98f7e65a62c80b89fda69138e804c03a9079dbdab7c457e04fd2ad4656629782cd96d97bf6070547bbe39bcf2c53746b3677"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-ga.ec.tex \
tex-hyph-ga.tex \
tex-loadhyph-ga.tex \
texlive-hyphen-irish"

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
