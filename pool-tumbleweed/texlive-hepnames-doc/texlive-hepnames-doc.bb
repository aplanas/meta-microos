SUMMARY = "Documentation for texlive-hepnames"
DESCRIPTION = "This package includes the documentation for texlive-hepnames"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn35722"

RPM_NAME = "texlive-hepnames-doc-2023.201.2.0svn35722-53.1.noarch.rpm"
RPM_HASH = "55408e756e661a0941ecadcb09dd364da589690abe123a1e61887333a17b169096d42fafa2e25fb71f3398e5e67c2d08aa8fb5739d0faca4caaf285112c5ecc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hepnames-doc"
RDEPENDS:${PN} += "/bin/bash"

inherit rpm
