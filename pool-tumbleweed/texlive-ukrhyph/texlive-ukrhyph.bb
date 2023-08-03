SUMMARY = "Hyphenation Patterns for Ukrainian"
DESCRIPTION = "A range of patterns, depending on the encoding of the output \
font (including the standard T2A, so one can use the patterns \
with free fonts)."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn21081"

RPM_NAME = "texlive-ukrhyph-2023.209.svn21081-54.1.noarch.rpm"
RPM_HASH = "711bb484578208f1353c29473ad7555a5af27029af31442db55689d82b51bc11d4baaea9e39c1c01c4469cfdd7f7e65221ba31e0b367cad3e52fa28e1d8cb45b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-catlcy.tex \
tex-lcy2koi.tex \
tex-lcy2lcy.tex \
tex-lcy2ot2.tex \
tex-lcy2t2a.tex \
tex-lcy2ucy.tex \
tex-rules-ph.tex \
tex-rules60.tex \
tex-rules90.tex \
tex-ukrenhyp.tex \
tex-ukrhypfa.tex \
tex-ukrhyph.tex \
tex-ukrhypmp.tex \
tex-ukrhypmt.tex \
tex-ukrhypsm.tex \
tex-ukrhypst.tex \
texlive-ukrhyph"

RDEPENDS:${PN} += "/usr/bin/sh \
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
