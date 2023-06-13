SUMMARY = "Modern Greek hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Modern Greek in monotonic and \
polytonic spelling in LGR and UTF-8 encodings. Patterns in \
UTF-8 use two code positions for each of the vowels with acute \
accent (a.k.a tonos, oxia), e.g., U+03AC, U+1F71 for alpha."
LICENSE = "LPPL-1.0"

PV = "2023.201.5svn58652"

RPM_NAME = "texlive-hyphen-greek-2023.201.5svn58652-52.1.noarch.rpm"
RPM_HASH = "8256bf13e224c9b9c6388ed9e1c1b1f1360eab5273a1938aea1872464e9471719c793290de81793ab64fc34c7e4efda5c5889e23092bc44db69d2b87354272bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(grmhyph5.tex) \
tex(grphyph5.tex) \
tex(hyph-el-monoton.tex) \
tex(hyph-el-polyton.tex) \
tex(loadhyph-el-monoton.tex) \
tex(loadhyph-el-polyton.tex) \
texlive-hyphen-greek"

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
