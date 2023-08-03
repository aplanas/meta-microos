SUMMARY = "Documentation for texlive-pyluatex"
DESCRIPTION = "This package includes the documentation for texlive-pyluatex"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.6.1svn65855"

RPM_NAME = "texlive-pyluatex-doc-2023.209.0.0.6.1svn65855-54.1.noarch.rpm"
RPM_HASH = "f59be79c6759f0090e39b254a65c8c72c664f8bbbd7feebc8c574d432536cfd2eac32e90687e1b3f0974952f830f47bfac780a6f3ff331fd08b7c56ae081a789"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pyluatex-doc"

RDEPENDS:${PN} += ""

inherit rpm
