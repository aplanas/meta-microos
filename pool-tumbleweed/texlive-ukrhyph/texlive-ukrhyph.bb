SUMMARY = "Hyphenation Patterns for Ukrainian"
DESCRIPTION = "A range of patterns, depending on the encoding of the output \
font (including the standard T2A, so one can use the patterns \
with free fonts)."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn21081"

RPM_NAME = "texlive-ukrhyph-2023.201.svn21081-53.1.noarch.rpm"
RPM_HASH = "820aff1eed180fcbb5a3a1a5349570f8a0b2c9930a0abd627a0ae784a2762838a35ab528e9a4d5faf1b0af5a03f2144382a6011b95538c148f9c1e26ebfc9046"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(catlcy.tex) \
tex(lcy2koi.tex) \
tex(lcy2lcy.tex) \
tex(lcy2ot2.tex) \
tex(lcy2t2a.tex) \
tex(lcy2ucy.tex) \
tex(rules60.tex) \
tex(rules90.tex) \
tex(rules_ph.tex) \
tex(ukrenhyp.tex) \
tex(ukrhypfa.tex) \
tex(ukrhyph.tex) \
tex(ukrhypmp.tex) \
tex(ukrhypmt.tex) \
tex(ukrhypsm.tex) \
tex(ukrhypst.tex) \
texlive-ukrhyph"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
