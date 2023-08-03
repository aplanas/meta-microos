SUMMARY = "Citation style for linguistic studies at the University of Wuppertal"
DESCRIPTION = "The package defines a BibLaTeX citation style based on the \
standard author-year style. The citations are optimised for \
linguistic studies at the Institute of Linguistics at the \
Bergische Universitat Wuppertal."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn31409"

RPM_NAME = "texlive-uni-wtal-lin-2023.209.0.0.2svn31409-54.1.noarch.rpm"
RPM_HASH = "a3def3f1cc0b1daaddc6d7ead1b8f61083eef58355e0fa30e0bae1300dbe9f0c0ce26d61c399fcc46b50b8da33652411a04556878a265a9332d6d7912bdc6159"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uni-wtal-lin.bbx \
tex-uni-wtal-lin.cbx \
texlive-uni-wtal-lin"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-authoryear.bbx \
tex-authoryear.cbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
