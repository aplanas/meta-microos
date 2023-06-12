SUMMARY = "Documentation for texlive-harnon-cv"
DESCRIPTION = "This package includes the documentation for texlive-harnon-cv"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.0svn26543"

RPM_NAME = "texlive-harnon-cv-doc-2023.201.1.0svn26543-53.1.noarch.rpm"
RPM_HASH = "8cc736cf51c575b2a08aa05807e4ac34b6e9be0a0681f9aa7b5490e1d5cf8ca5539bef01c9e5f9cce6e5f55a77fa20dd41e8ffe22c4fa06e69fe666f420a4063"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-harnon-cv-doc"
RDEPENDS:${PN} += ""

inherit rpm
