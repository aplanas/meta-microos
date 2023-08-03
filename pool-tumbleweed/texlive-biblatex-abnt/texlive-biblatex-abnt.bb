SUMMARY = "BibLaTeX style for Brazil's ABNT rules"
DESCRIPTION = "This package offers a BibLaTeX style for Brazil's ABNT \
(Brazilian Association of Technical Norms) rules."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.4svn49179"

RPM_NAME = "texlive-biblatex-abnt-2023.209.3.4svn49179-54.1.noarch.rpm"
RPM_HASH = "a25826a6ce016c868825dea4bd8fcc1169caefdaa29c557e2260970332636bcde5f5e3cdfac4d23ef7b87878d364b5712cc37599b517232f142aa71688ec4967"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-abnt-ibid.bbx \
tex-abnt-ibid.cbx \
tex-abnt-numeric.bbx \
tex-abnt-numeric.cbx \
tex-abnt.bbx \
tex-abnt.cbx \
tex-american-abnt.lbx \
tex-australian-abnt.lbx \
tex-brazil-abnt.lbx \
tex-brazilian-abnt.lbx \
tex-british-abnt.lbx \
tex-canadian-abnt.lbx \
tex-english-abnt.lbx \
tex-portuges-abnt.lbx \
tex-portuguese-abnt.lbx \
tex-spanish-abnt.lbx \
texlive-biblatex-abnt"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-authoryear-comp.cbx \
tex-brazilian.lbx \
tex-english.lbx \
tex-expl3.sty \
tex-numeric.cbx \
tex-spanish.lbx \
tex-standard.bbx \
tex-xparse.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
