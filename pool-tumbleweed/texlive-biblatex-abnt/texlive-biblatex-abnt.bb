SUMMARY = "BibLaTeX style for Brazil's ABNT rules"
DESCRIPTION = "This package offers a BibLaTeX style for Brazil's ABNT \
(Brazilian Association of Technical Norms) rules."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.4svn49179"

RPM_NAME = "texlive-biblatex-abnt-2023.201.3.4svn49179-53.1.noarch.rpm"
RPM_HASH = "763e191915289dfda9596500d7350afe1291b8388ca8e03ccef6ee61f05aeb0c9dea7dc727357941b064124fe4b8c408331d7d3e3b270299d0d902f757a5f64e"
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

RDEPENDS:${PN} += "/bin/sh \
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
