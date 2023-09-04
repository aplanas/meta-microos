SUMMARY = "Afrikaans hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Afrikaans in T1/EC and UTF-8 \
encodings. OpenOffice includes older patterns created by a \
different author, but the patterns packaged with TeX are \
considered superior in quality."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58609"

RPM_NAME = "texlive-hyphen-afrikaans-2023.209.svn58609-54.1.noarch.rpm"
RPM_HASH = "42865e2874fe81187369e658fe25361ab74a0a165ecacd6dba7d65173a967031efd6d5e8cc5a9b3f6ee82ae213722f9408e34e76526561236de8d0ce6f71d8d7"
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
