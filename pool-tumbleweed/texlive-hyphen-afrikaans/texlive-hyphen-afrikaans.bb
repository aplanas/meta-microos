SUMMARY = "Afrikaans hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Afrikaans in T1/EC and UTF-8 \
encodings. OpenOffice includes older patterns created by a \
different author, but the patterns packaged with TeX are \
considered superior in quality."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58609"

RPM_NAME = "texlive-hyphen-afrikaans-2023.201.svn58609-52.1.noarch.rpm"
RPM_HASH = "24495bbd664b821581d95f73c6f843f0bd90819667f883154912e733e1e21072f2b40a80fdfe2049fe97990fda90babe40c9fd40c2a686a6099cc46069a66cbf"
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
