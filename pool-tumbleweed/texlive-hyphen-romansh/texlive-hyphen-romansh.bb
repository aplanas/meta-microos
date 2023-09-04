SUMMARY = "Romansh hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Romansh in ASCII encoding. They are \
supposed to comply with the rules indicated by the Lia \
Rumantscha (Romansh language society)."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58652"

RPM_NAME = "texlive-hyphen-romansh-2023.209.svn58652-54.1.noarch.rpm"
RPM_HASH = "57898ce374e77ea4ebb43bd801fc764ed2aaadde2c84b999c8e1c0e18e192fa52fd21c860d6e9711689e3650779d4d3aa26b8a501bfbcb16e292318a01c5312f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-quote-rm.tex \
tex-hyph-rm.tex \
tex-loadhyph-rm.tex \
texlive-hyphen-romansh"

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
