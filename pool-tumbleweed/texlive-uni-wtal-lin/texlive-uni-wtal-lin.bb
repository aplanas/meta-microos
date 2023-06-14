SUMMARY = "Citation style for linguistic studies at the University of Wuppertal"
DESCRIPTION = "The package defines a BibLaTeX citation style based on the \
standard author-year style. The citations are optimised for \
linguistic studies at the Institute of Linguistics at the \
Bergische Universitat Wuppertal."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn31409"

RPM_NAME = "texlive-uni-wtal-lin-2023.201.0.0.2svn31409-53.1.noarch.rpm"
RPM_HASH = "433639d348d306c186b342c3ee9b1cd310685ac28c3203ddae5d1014a716694bc3e8de0c5942294aeaad2c63136e5f9ac8f84bee091b4d5fa40da4fd04bb8832"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uni-wtal-lin.bbx \
tex-uni-wtal-lin.cbx \
texlive-uni-wtal-lin"

RDEPENDS:${PN} += "/bin/sh \
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
