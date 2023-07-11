SUMMARY = "Interlingua hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Interlingua in ASCII encoding."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn58609"

RPM_NAME = "texlive-hyphen-interlingua-2023.208.svn58609-53.1.noarch.rpm"
RPM_HASH = "f08d8e5c4528ccf65efb22fc214ec67038d82ebfb6a1d43e2ef52fa74da84d270fd79c578908896cfc2d5cf16537d6cf6e104920fe23af4e183d8fff1e0c5e0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-ia.tex \
tex-loadhyph-ia.tex \
texlive-hyphen-interlingua"

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
