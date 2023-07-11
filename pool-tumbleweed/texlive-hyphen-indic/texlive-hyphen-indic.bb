SUMMARY = "Indic hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Assamese, Bengali, Gujarati, Hindi, \
Kannada, Malayalam, Marathi, Oriya, Panjabi, Tamil and Telugu \
for Unicode engines."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn58652"

RPM_NAME = "texlive-hyphen-indic-2023.208.svn58652-53.1.noarch.rpm"
RPM_HASH = "18651bac0b4856bfd1338e30fc8099a17f24d10cdae880a5d27f74d3df80234039f3434278aa0c137c7780de83db1ef7800488d7213f3960b32ad3db85ef2080"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-as.tex \
tex-hyph-bn.tex \
tex-hyph-gu.tex \
tex-hyph-hi.tex \
tex-hyph-kn.tex \
tex-hyph-ml.tex \
tex-hyph-mr.tex \
tex-hyph-or.tex \
tex-hyph-pa.tex \
tex-hyph-pi.tex \
tex-hyph-ta.tex \
tex-hyph-te.tex \
tex-loadhyph-as.tex \
tex-loadhyph-bn.tex \
tex-loadhyph-gu.tex \
tex-loadhyph-hi.tex \
tex-loadhyph-kn.tex \
tex-loadhyph-ml.tex \
tex-loadhyph-mr.tex \
tex-loadhyph-or.tex \
tex-loadhyph-pa.tex \
tex-loadhyph-pi.tex \
tex-loadhyph-ta.tex \
tex-loadhyph-te.tex \
texlive-hyphen-indic"

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
