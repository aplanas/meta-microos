SUMMARY = "Documentation for texlive-subeqnarray"
DESCRIPTION = "This package includes the documentation for texlive-subeqnarray"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1csvn15878"

RPM_NAME = "texlive-subeqnarray-doc-2023.201.2.1csvn15878-57.1.noarch.rpm"
RPM_HASH = "fafe53178a51f7d3a84808177a914ebd47918225db2a8470d09fed8a617c392655a7ed07d5d0a14184cc1204c9cbdb2a8e4ecff55a64d1c5fe8942b2fdecea9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-subeqnarray-doc"

RDEPENDS:${PN} += ""

inherit rpm
