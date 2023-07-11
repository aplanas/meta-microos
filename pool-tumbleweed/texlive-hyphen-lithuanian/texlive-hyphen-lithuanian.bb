SUMMARY = "Lithuanian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Lithuanian in L7X and UTF-8 encodings. \
\\lefthyphenmin and \\righthyphenmin have to be at least 2."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn58652"

RPM_NAME = "texlive-hyphen-lithuanian-2023.208.svn58652-53.1.noarch.rpm"
RPM_HASH = "25f9bc27ead6ff311bccf0a5124898d532a2eb30e4777000c038634a357353f90e4a53cbec9136723cda9ed0b4247f0491d3823aae7003f949e5d77e98154354"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-lt.l7x.tex \
tex-hyph-lt.tex \
tex-loadhyph-lt.tex \
texlive-hyphen-lithuanian"

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
