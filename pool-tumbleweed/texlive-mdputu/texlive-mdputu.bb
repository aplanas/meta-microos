SUMMARY = "Upright digits in Adobe Utopia Italic"
DESCRIPTION = "The Annals of Mathematics uses italics for theorems. However, \
slanted digits and parentheses look disturbing when surrounded \
by (upright) mathematics. This package provides virtual fonts \
with italics and upright digits and punctuation, as an \
extension to Mathdesign's Utopia bundle."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn20298"

RPM_NAME = "texlive-mdputu-2023.201.1.2svn20298-52.1.noarch.rpm"
RPM_HASH = "c73649f5e5b61411bb8bc77d558efcdca4320d9bff227b14986805779cc371c9f5a45f5e5be49b0f40225d4bef358fbc3be25e469392881f84bf6d43ddc07adc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(mdputu.sty) \
tex(mdputubi7t.tfm) \
tex(mdputubi7t.vf) \
tex(mdputubi8t.tfm) \
tex(mdputubi8t.vf) \
tex(mdputuri7t.tfm) \
tex(mdputuri7t.vf) \
tex(mdputuri8t.tfm) \
tex(mdputuri8t.vf) \
tex(ot1mdputu.fd) \
tex(t1mdputu.fd) \
texlive-mdputu"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(mdputb7t.tfm) \
tex(mdputb8t.tfm) \
tex(mdputbi7t.tfm) \
tex(mdputbi8t.tfm) \
tex(mdputr7t.tfm) \
tex(mdputr8t.tfm) \
tex(mdputri7t.tfm) \
tex(mdputri8t.tfm) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
