SUMMARY = "Indic hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Assamese, Bengali, Gujarati, Hindi, \
Kannada, Malayalam, Marathi, Oriya, Panjabi, Tamil and Telugu \
for Unicode engines."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58652"

RPM_NAME = "texlive-hyphen-indic-2023.201.svn58652-52.1.noarch.rpm"
RPM_HASH = "7962b4375534c5633049b15854d6c63243587e919541781e7f0655312efe27292040ec782e2ed07dbd30d8f0b0f841a434c59f76c233bf4a813a03d478a7a1ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hyph-as.tex) \
tex(hyph-bn.tex) \
tex(hyph-gu.tex) \
tex(hyph-hi.tex) \
tex(hyph-kn.tex) \
tex(hyph-ml.tex) \
tex(hyph-mr.tex) \
tex(hyph-or.tex) \
tex(hyph-pa.tex) \
tex(hyph-pi.tex) \
tex(hyph-ta.tex) \
tex(hyph-te.tex) \
tex(loadhyph-as.tex) \
tex(loadhyph-bn.tex) \
tex(loadhyph-gu.tex) \
tex(loadhyph-hi.tex) \
tex(loadhyph-kn.tex) \
tex(loadhyph-ml.tex) \
tex(loadhyph-mr.tex) \
tex(loadhyph-or.tex) \
tex(loadhyph-pa.tex) \
tex(loadhyph-pi.tex) \
tex(loadhyph-ta.tex) \
tex(loadhyph-te.tex) \
texlive-hyphen-indic"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(language.dat) \
tex(language.dat.lua) \
tex(language.def) \
texlive \
texlive-filesystem \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
