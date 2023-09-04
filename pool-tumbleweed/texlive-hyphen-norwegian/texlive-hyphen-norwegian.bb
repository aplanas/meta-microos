SUMMARY = "Norwegian Bokmal and Nynorsk hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Norwegian Bokmal and Nynorsk in T1/EC \
and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58609"

RPM_NAME = "texlive-hyphen-norwegian-2023.209.svn58609-54.1.noarch.rpm"
RPM_HASH = "34c63e20abd41ade98d96af2c113596404e4e72927b54dc1a901a4432e0fe95ba2627a0c18b0842c84e3e80525f5ae6efebd3396cde9bd3756ba66f818cc3cc3"
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
