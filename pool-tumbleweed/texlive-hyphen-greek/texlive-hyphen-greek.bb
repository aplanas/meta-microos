SUMMARY = "Modern Greek hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Modern Greek in monotonic and \
polytonic spelling in LGR and UTF-8 encodings. Patterns in \
UTF-8 use two code positions for each of the vowels with acute \
accent (a.k.a tonos, oxia), e.g., U+03AC, U+1F71 for alpha."
LICENSE = "LPPL-1.0"

PV = "2023.208.5svn58652"

RPM_NAME = "texlive-hyphen-greek-2023.208.5svn58652-53.1.noarch.rpm"
RPM_HASH = "bfce226a9bb70e431b8cd7df24e273114c70d90caab6aed0438bc9b3f352c5af23d436e12be2202d82a0e66839c2f04dfd20a530065636ebdfecc72dd97af8e6"
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
