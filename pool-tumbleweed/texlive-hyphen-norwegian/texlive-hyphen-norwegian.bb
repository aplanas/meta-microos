SUMMARY = "Norwegian Bokmal and Nynorsk hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Norwegian Bokmal and Nynorsk in T1/EC \
and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn58609"

RPM_NAME = "texlive-hyphen-norwegian-2023.208.svn58609-53.1.noarch.rpm"
RPM_HASH = "4f4192f14645e063675b87322cf79790aa6e8f613cce3db0645891aa3dacc17cade2ddda6225cb7de773dce1cf8e85414fa829955a7fae212725c9b272ae5a5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-nb.ec.tex \
tex-hyph-nb.tex \
tex-hyph-nn.ec.tex \
tex-hyph-nn.tex \
tex-hyph-no.tex \
tex-loadhyph-nb.tex \
tex-loadhyph-nn.tex \
texlive-hyphen-norwegian"

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
