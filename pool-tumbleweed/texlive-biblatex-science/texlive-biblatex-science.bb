SUMMARY = "BibLaTeX implementation of the Science bibliography style"
DESCRIPTION = "The bundle offers styles that allow authors to use BibLaTeX \
when preparing papers for submission to the journal Science."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn48945"

RPM_NAME = "texlive-biblatex-science-2023.201.1.2svn48945-53.1.noarch.rpm"
RPM_HASH = "b5c3675aa22909a92b21585c52034682b18eef8498e2ed50391f396fa0a49c561859da16298e4af5242a22e18b4e77b5150f14da0b0d6778a90e389254214d77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-science.bbx \
tex-science.cbx \
texlive-biblatex-science"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-numeric-comp.bbx \
tex-numeric-comp.cbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
