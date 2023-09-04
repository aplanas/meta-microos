SUMMARY = "Armenian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Armenian for Unicode engines. \
Auto-generated from a script included in hyph-utf8."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58652"

RPM_NAME = "texlive-hyphen-armenian-2023.209.svn58652-54.1.noarch.rpm"
RPM_HASH = "177a8412045fd17353ba75df0857203926582ef0eff7cca3bfc18c8d9891f3a3283b38c34920f1a3612884da0d2cbd76d79138234bcca1444e3204670cbff744"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-hy.tex \
tex-loadhyph-hy.tex \
texlive-hyphen-armenian"

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
