SUMMARY = "Interlingua hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Interlingua in ASCII encoding."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58609"

RPM_NAME = "texlive-hyphen-interlingua-2023.209.svn58609-54.1.noarch.rpm"
RPM_HASH = "58b06a8eee9cb2593c50f258e04e49b7b0fd42d5a57e90fff2cd5cc63c8ab23230b71913ac7658a16f6e99f2d69c7c29f4d5ea556e6a8a1c0b7c598342773714"
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
