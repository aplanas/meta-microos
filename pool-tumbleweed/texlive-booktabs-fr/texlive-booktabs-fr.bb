SUMMARY = "French translation of booktabs documentation"
DESCRIPTION = "The translation comes from a collection provided by Benjamin \
Bayart."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.00svn21948"

RPM_NAME = "texlive-booktabs-fr-2023.201.1.00svn21948-52.1.noarch.rpm"
RPM_HASH = "9da5788034c0773179a2a1799c390e6070f94841235e6ee9803c9b5483c334010bcefc43b81ebd14f85e57cc50449a14ced99f03fe8d942c46e9d9b4a3cbf3dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-booktabs-fr"

RDEPENDS:${PN} += "/bin/sh \
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
