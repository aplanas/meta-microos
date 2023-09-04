SUMMARY = "Icelandic hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Icelandic in T1/EC and UTF-8 \
encodings."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58652"

RPM_NAME = "texlive-hyphen-icelandic-2023.209.svn58652-54.1.noarch.rpm"
RPM_HASH = "b1d0befb375577fbd25a4665b58b6fda9decd625eee94d3ebcc4b01ebda886bd3478320afedcc8571ad155148b6b42736d39d272fa298d9a8212cd81449759ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-is.ec.tex \
tex-hyph-is.tex \
tex-loadhyph-is.tex \
texlive-hyphen-icelandic"

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
