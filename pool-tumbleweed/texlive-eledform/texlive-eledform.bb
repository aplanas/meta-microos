SUMMARY = "Define textual variants"
DESCRIPTION = "The package provides commands to formalize textual variants in \
critical editions typeset using eledmac."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1asvn38114"

RPM_NAME = "texlive-eledform-2023.201.1.1asvn38114-53.1.noarch.rpm"
RPM_HASH = "43df6441a51a5407e60c552dd0df50cd523df6ce759419604c72bbd67142baa279fae2b047e3ba95127468e9c848804b97528c5bf7236e02172080f6fca45ca7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eledform.sty \
texlive-eledform"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-eledmac.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
