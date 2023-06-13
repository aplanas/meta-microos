SUMMARY = "Documentation for texlive-vaucanson-g"
DESCRIPTION = "This package includes the documentation for texlive-vaucanson-g"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn15878"

RPM_NAME = "texlive-vaucanson-g-doc-2023.201.0.0.4svn15878-53.1.noarch.rpm"
RPM_HASH = "5b6d27ab718dc5913ff12939e3dae0e321085d6b7faefa2d4e07e187f7a2fd919593963ef57d14bd30b312e0af623ada15a7387fc68241f500f4419ac4c93526"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-vaucanson-g-doc"

RDEPENDS:${PN} += ""

inherit rpm
