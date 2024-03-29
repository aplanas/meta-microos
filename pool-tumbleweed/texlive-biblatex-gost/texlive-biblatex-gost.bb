SUMMARY = "BibLaTeX support for GOST standard bibliographies"
DESCRIPTION = "The package provides BibLaTeX support for Russian bibliography \
style GOST 7.0.5-2008"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.22svn59135"

RPM_NAME = "texlive-biblatex-gost-2023.209.1.22svn59135-54.1.noarch.rpm"
RPM_HASH = "b31c6ed5be8ca0ea6fca3750b91ab467cb7e1048ce3d3a796f8144dcb48387454da142876104de9b66c917fc8019799e7117dbac0e0cd1d6d940fa1706fedeb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-american-gost.lbx \
tex-biblatex-gost.def \
tex-brazilian-gost.lbx \
tex-british-gost.lbx \
tex-catalan-gost.lbx \
tex-croatian-gost.lbx \
tex-english-gost.lbx \
tex-french-gost.lbx \
tex-galician-gost.lbx \
tex-german-gost.lbx \
tex-gost-alphabetic-min.bbx \
tex-gost-alphabetic-min.cbx \
tex-gost-alphabetic.bbx \
tex-gost-alphabetic.cbx \
tex-gost-authoryear-min.bbx \
tex-gost-authoryear-min.cbx \
tex-gost-authoryear.bbx \
tex-gost-authoryear.cbx \
tex-gost-footnote-min.bbx \
tex-gost-footnote-min.cbx \
tex-gost-footnote.bbx \
tex-gost-footnote.cbx \
tex-gost-inline-min.bbx \
tex-gost-inline-min.cbx \
tex-gost-inline.bbx \
tex-gost-inline.cbx \
tex-gost-numeric-min.bbx \
tex-gost-numeric-min.cbx \
tex-gost-numeric.bbx \
tex-gost-numeric.cbx \
tex-gost-standard.bbx \
tex-greek-gost.lbx \
tex-icelandic-gost.lbx \
tex-italian-gost.lbx \
tex-portuguese-gost.lbx \
tex-russian-gost.lbx \
tex-slovene-gost.lbx \
tex-spanish-gost.lbx \
texlive-biblatex-gost"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-alphabetic.cbx \
tex-american.lbx \
tex-brazilian.lbx \
tex-british.lbx \
tex-catalan.lbx \
tex-croatian.lbx \
tex-english.lbx \
tex-french.lbx \
tex-galician.lbx \
tex-german.lbx \
tex-greek.lbx \
tex-icelandic.lbx \
tex-italian.lbx \
tex-numeric-comp.cbx \
tex-portuguese.lbx \
tex-slovene.lbx \
tex-spanish.lbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
