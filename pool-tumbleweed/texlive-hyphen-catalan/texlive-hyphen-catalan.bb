SUMMARY = "Catalan hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Catalan in T1/EC and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn58609"

RPM_NAME = "texlive-hyphen-catalan-2023.208.svn58609-53.1.noarch.rpm"
RPM_HASH = "ef57ea06cc7d0fadea7652467fb87b27196f320418246c5702c2ccf899e264b29d6c81d492e3ed528c73c85c7d4a08ee92c4ea9d9739f5686d888cfba8c03f37"
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
