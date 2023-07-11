SUMMARY = "Afrikaans hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Afrikaans in T1/EC and UTF-8 \
encodings. OpenOffice includes older patterns created by a \
different author, but the patterns packaged with TeX are \
considered superior in quality."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn58609"

RPM_NAME = "texlive-hyphen-afrikaans-2023.208.svn58609-53.1.noarch.rpm"
RPM_HASH = "5672220acd880a9e4638e610c391b189257a2f956aa0c1d2e93daa27d5edefd81df2df2d1e53f3ea4712ab964972bcf9e1635bc473d1367e9db66ad87e5fae79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-af.ec.tex \
tex-hyph-af.tex \
tex-hyph-quote-af.tex \
tex-loadhyph-af.tex \
texlive-hyphen-afrikaans"

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
