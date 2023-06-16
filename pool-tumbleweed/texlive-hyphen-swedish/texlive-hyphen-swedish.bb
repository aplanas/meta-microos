SUMMARY = "Swedish hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Swedish in T1/EC and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58652"

RPM_NAME = "texlive-hyphen-swedish-2023.201.svn58652-52.1.noarch.rpm"
RPM_HASH = "0cb3d47df6fbc69175504057f71db0ee358db567f0ac24d33f6dc9001e041b2b0662f000fd52eae988453a52529abc226c91f3780bbfdf7f9248a9eb4030b0af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-sv.ec.tex \
tex-hyph-sv.tex \
tex-loadhyph-sv.tex \
texlive-hyphen-swedish"

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
