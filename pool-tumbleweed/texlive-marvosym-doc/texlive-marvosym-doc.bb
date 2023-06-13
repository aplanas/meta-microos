SUMMARY = "Documentation for texlive-marvosym"
DESCRIPTION = "This package includes the documentation for texlive-marvosym"
LICENSE = "OFL-1.1"

PV = "2023.201.2.2asvn29349"

RPM_NAME = "texlive-marvosym-doc-2023.201.2.2asvn29349-52.1.noarch.rpm"
RPM_HASH = "c1d8b3956b627f8afc547310c693f6b5fe56650e9a1f3903dd66381dea4e89bc294a477eb7780344a0ad073b280817ed5a34d731dd2c65c741cb0416af59bbaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-marvosym-doc"

RDEPENDS:${PN} += ""

inherit rpm
