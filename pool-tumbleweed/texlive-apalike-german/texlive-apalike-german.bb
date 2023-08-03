SUMMARY = "A copy of apalike.bst with German localization"
DESCRIPTION = "A copy of apalike.bst (which is part of the base BibTeX \
distribution) with German localization."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65403"

RPM_NAME = "texlive-apalike-german-2023.209.svn65403-55.1.noarch.rpm"
RPM_HASH = "9b1fe46a8cefbe927b84b2208550b17e58a357265032758314ece1d5572bb2f811cc6f02ffbe002973c73766ad0d432eced1e519cf7eaeb72df560f57c18e361"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-apalike-german"

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
