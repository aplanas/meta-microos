SUMMARY = "BibLaTeX style for ISO 690 standard"
DESCRIPTION = "The package provides a bibliography and citation style which \
conforms to the latest revision of the international standard \
ISO 690:2010. The implementation follows BibLaTeX conventions \
and requires BibLaTeX [?] 3.4 and biber [?] 2.5."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4.1svn62866"

RPM_NAME = "texlive-biblatex-iso690-2023.209.0.0.4.1svn62866-54.1.noarch.rpm"
RPM_HASH = "b3dd2e673f567dd4a8abceb8bcf8052293d588980becdb43620912117c8d0ab5986282b00a3ebe69ad85b16aa2c6524ae95d9d6fc05481bfdb3cf024303d791a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bulgarian-iso.lbx \
tex-czech-iso.lbx \
tex-english-iso.lbx \
tex-french-iso.lbx \
tex-german-iso.lbx \
tex-iso-alphabetic.bbx \
tex-iso-alphabetic.cbx \
tex-iso-authortitle.bbx \
tex-iso-authortitle.cbx \
tex-iso-authoryear.bbx \
tex-iso-authoryear.cbx \
tex-iso-fullcite.cbx \
tex-iso-numeric.bbx \
tex-iso-numeric.cbx \
tex-iso.bbx \
tex-ngerman-iso.lbx \
tex-polish-iso.lbx \
tex-slovak-iso.lbx \
tex-spanish-iso.lbx \
texlive-biblatex-iso690"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-alphabetic.cbx \
tex-authortitle.cbx \
tex-authoryear.cbx \
tex-bulgarian.lbx \
tex-czech.lbx \
tex-english.lbx \
tex-french.lbx \
tex-german.lbx \
tex-ngerman.lbx \
tex-numeric.cbx \
tex-polish.lbx \
tex-slovak.lbx \
tex-spanish.lbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
