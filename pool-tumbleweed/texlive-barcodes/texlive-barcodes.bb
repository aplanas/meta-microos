SUMMARY = "Fonts for making barcodes"
DESCRIPTION = "The package deals with EAN barcodes; Metafont sources for fonts \
are provided, and a set of examples; for some codes, a small \
Perl script is needed."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-barcodes-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "4c4dab1ce6294afd588b854ed4bca40ec81ba9a78dd4cb6323663a200237a26d11abf201ed3fec70933b373973541ad750cdda28059d312a5c671723af98b33c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-barcodes.sty \
tex-wlc11.tfm \
tex-wlc128.tfm \
tex-wlc39.tfm \
tex-wlc93.tfm \
tex-wlcr39.tfm \
texlive-barcodes"

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
