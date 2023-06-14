SUMMARY = "Romansh hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Romansh in ASCII encoding. They are \
supposed to comply with the rules indicated by the Lia \
Rumantscha (Romansh language society)."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58652"

RPM_NAME = "texlive-hyphen-romansh-2023.201.svn58652-52.1.noarch.rpm"
RPM_HASH = "3f22482c089dd474c7ac7206e294f114e150d5caaa1e4ede1864d1695a82d68324839d98a24ee9cce3515c938f6f1430e533139c3308c8a10978a8c9a376d2de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-quote-rm.tex \
tex-hyph-rm.tex \
tex-loadhyph-rm.tex \
texlive-hyphen-romansh"

RDEPENDS:${PN} += "/bin/sh \
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
