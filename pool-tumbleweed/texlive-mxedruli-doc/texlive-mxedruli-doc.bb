SUMMARY = "Documentation for texlive-mxedruli"
DESCRIPTION = "This package includes the documentation for texlive-mxedruli"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.3csvn30021"

RPM_NAME = "texlive-mxedruli-doc-2023.209.3.3csvn30021-55.1.noarch.rpm"
RPM_HASH = "e93511c62b7e19a037d41c786594472596f10ed964e30278c7647cb6223e03c14b62b66b87cb0ec5edc81f0415ae7151757d8ab7775545b0d1d9121ec87d2d1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mxedruli-doc"

RDEPENDS:${PN} += ""

inherit rpm
