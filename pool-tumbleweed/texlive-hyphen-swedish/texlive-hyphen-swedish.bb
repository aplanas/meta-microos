SUMMARY = "Swedish hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Swedish in T1/EC and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn58652"

RPM_NAME = "texlive-hyphen-swedish-2023.208.svn58652-53.1.noarch.rpm"
RPM_HASH = "4a51deff20a6ddfefc6acd4babb06c4666a03011b662be77450a0464adbb677825f355188c715b48fcac94fb8a1d787d37680c53b0564bf1eae06f517c5e2690"
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
