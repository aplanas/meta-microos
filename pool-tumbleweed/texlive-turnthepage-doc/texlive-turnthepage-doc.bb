SUMMARY = "Documentation for texlive-turnthepage"
DESCRIPTION = "This package includes the documentation for texlive-turnthepage"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3asvn29803"

RPM_NAME = "texlive-turnthepage-doc-2023.209.1.3asvn29803-53.1.noarch.rpm"
RPM_HASH = "3e6629a30e2ee49ae769abc9ec5ad7ab0a53b391a4e36c1838c4a7583a70020fbaa75a6bd7e816b9b476b875e89b22011e3af00c4e30a32e380646ec7f8d696e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-turnthepage-doc"

RDEPENDS:${PN} += ""

inherit rpm
