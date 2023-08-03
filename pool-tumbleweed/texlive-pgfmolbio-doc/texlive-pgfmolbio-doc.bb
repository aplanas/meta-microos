SUMMARY = "Documentation for texlive-pgfmolbio"
DESCRIPTION = "This package includes the documentation for texlive-pgfmolbio"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.21svn35152"

RPM_NAME = "texlive-pgfmolbio-doc-2023.209.0.0.21svn35152-52.1.noarch.rpm"
RPM_HASH = "8552a70712dac653fe7d0916b1f6132098d5f262d40e0271fee625e7237c5c17bc56af7b6b3d7c5f4ff9a241e1079169128d707f360e44efa36aa0321959b7f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pgfmolbio-doc"

RDEPENDS:${PN} += ""

inherit rpm
