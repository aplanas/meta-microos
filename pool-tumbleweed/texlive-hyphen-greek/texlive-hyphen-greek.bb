SUMMARY = "Modern Greek hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Modern Greek in monotonic and \
polytonic spelling in LGR and UTF-8 encodings. Patterns in \
UTF-8 use two code positions for each of the vowels with acute \
accent (a.k.a tonos, oxia), e.g., U+03AC, U+1F71 for alpha."
LICENSE = "LPPL-1.0"

PV = "2023.209.5svn58652"

RPM_NAME = "texlive-hyphen-greek-2023.209.5svn58652-54.1.noarch.rpm"
RPM_HASH = "1e1a3105c6e1c6ff74453707a54f9700732a73c9402ab2c93bf969e24b30d966bbf34c903c5b599c068b046f5cea13eb12e8f60cf3824905338d2caff422f9fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-grmhyph5.tex \
tex-grphyph5.tex \
tex-hyph-el-monoton.tex \
tex-hyph-el-polyton.tex \
tex-loadhyph-el-monoton.tex \
tex-loadhyph-el-polyton.tex \
texlive-hyphen-greek"

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
