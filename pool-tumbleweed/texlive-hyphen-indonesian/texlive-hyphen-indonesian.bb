SUMMARY = "Indonesian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Indonesian (Bahasa Indonesia) in ASCII \
encoding. They are probably also usable for Malay (Bahasa \
Melayu)."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn58609"

RPM_NAME = "texlive-hyphen-indonesian-2023.208.svn58609-53.1.noarch.rpm"
RPM_HASH = "9cc2a1d7ba34a9f34cd648b448203d975abe8703537c1eb56cdf9b737f4d82ae5fef88580e02a680536c262735bce2d237b0caf263e61ab207035e262edec2fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-id.tex \
tex-loadhyph-id.tex \
texlive-hyphen-indonesian"

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
