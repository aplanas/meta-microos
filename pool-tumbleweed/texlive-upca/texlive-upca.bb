SUMMARY = "Print UPC-A barcodes"
DESCRIPTION = "The package defines a single macro \\upca, to print UPC-A \
barcodes."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn22511"

RPM_NAME = "texlive-upca-2023.209.svn22511-54.1.noarch.rpm"
RPM_HASH = "4727254ccdefc4200aa8da4969cfd436651a43856b0f25bc5dba272b00121c1544155cff1052ff571d1c387a2886e06cb3540d229c6fd0ef44f01659e423d477"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-upca.tex \
texlive-upca"

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
