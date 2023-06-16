SUMMARY = "Belarusian hyphenation patterns"
DESCRIPTION = "Belarusian hyphenation patterns in T2A and UTF-8 encodings"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58652"

RPM_NAME = "texlive-hyphen-belarusian-2023.201.svn58652-52.1.noarch.rpm"
RPM_HASH = "0dddf8e14a5570b2e4768912418aed220deb41c58bf1ef5909128306db628c6f9f727fe380487cbac298c18a6387ddeb6e3b5098ca4d5a04e7a8425868d81e6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-be.t2a.tex \
tex-hyph-be.tex \
tex-hyph-quote-be.tex \
tex-loadhyph-be.tex \
texlive-hyphen-belarusian"

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
