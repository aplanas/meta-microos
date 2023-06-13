SUMMARY = "Documentation for texlive-seminar"
DESCRIPTION = "This package includes the documentation for texlive-seminar"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.63asvn59801"

RPM_NAME = "texlive-seminar-doc-2023.201.1.63asvn59801-53.1.noarch.rpm"
RPM_HASH = "02c256c53e74361ba8a89a198a381f68168f4d743c3a4499765af3c6ac50ca03c13aeead626036c140dc47be0e07ad3947b1016fb7dac46db6dcf8d1fc7255fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-seminar-doc"

RDEPENDS:${PN} += "/bin/bash"

inherit rpm
