SUMMARY = "Documentation files for (u)pBibTeX"
DESCRIPTION = "The bundle contains documentation files for Japanese pBibTeX \
and upBibTeX. For historical reasons, this also contains old \
documentation files for JBibTeX."
LICENSE = "BSD-3-Clause"

PV = "2023.201.svn66181"

RPM_NAME = "texlive-pbibtex-manual-2023.201.svn66181-51.1.noarch.rpm"
RPM_HASH = "e20d50a6f633608c49a162453f61bb6b3068bde57f0249031bc62a0bbec845705827fcfd6b1438f9cb221e6e15a642962ad40f55b5ae92a21d75795e6723bad3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pbibtex-manual"

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
