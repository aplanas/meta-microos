SUMMARY = "Indic hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Assamese, Bengali, Gujarati, Hindi, \
Kannada, Malayalam, Marathi, Oriya, Panjabi, Tamil and Telugu \
for Unicode engines."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58652"

RPM_NAME = "texlive-hyphen-indic-2023.209.svn58652-54.1.noarch.rpm"
RPM_HASH = "a2032d0009223d022993fa790f48b2d91b92a12c4a6b8a569b3d834450395206bcf222cf9bb95a9c8de63819cbad724a4d3a20028a73cd94a9cc6b2858081354"
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
