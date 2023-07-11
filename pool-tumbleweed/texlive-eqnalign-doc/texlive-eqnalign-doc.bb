SUMMARY = "Documentation for texlive-eqnalign"
DESCRIPTION = "This package includes the documentation for texlive-eqnalign"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0asvn43278"

RPM_NAME = "texlive-eqnalign-doc-2023.201.1.0asvn43278-53.2.noarch.rpm"
RPM_HASH = "f156b602c3c7519c1943dd4972f34394d25554162663b409bec1c0dae57d9a71069febda48cabaa66c287b05db98e63d0d9259594ceb8612e4a1a2c15b311a35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eqnalign-doc"

RDEPENDS:${PN} += ""

inherit rpm
