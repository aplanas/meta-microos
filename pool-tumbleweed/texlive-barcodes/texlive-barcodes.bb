SUMMARY = "Fonts for making barcodes"
DESCRIPTION = "The package deals with EAN barcodes; Metafont sources for fonts \
are provided, and a set of examples; for some codes, a small \
Perl script is needed."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-barcodes-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "0a7bf7fc45090985cf5f5995024796345041c76c53501adbfa996bc212f5ddc33cad5d24f199a4fe035816b010814ac5521d5a99de4fa2032c78efd7f8aa6dd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-barcodes.sty \
tex-wlc11.tfm \
tex-wlc128.tfm \
tex-wlc39.tfm \
tex-wlc93.tfm \
tex-wlcr39.tfm \
texlive-barcodes"

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
