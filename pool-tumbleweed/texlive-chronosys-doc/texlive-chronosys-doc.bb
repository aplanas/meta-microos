SUMMARY = "Documentation for texlive-chronosys"
DESCRIPTION = "This package includes the documentation for texlive-chronosys"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn26700"

RPM_NAME = "texlive-chronosys-doc-2023.209.1.2svn26700-54.1.noarch.rpm"
RPM_HASH = "877edf3684bcd1137ebc12eb5ef5b62766bad93d4964214c1edbf35b8665e1940efebe88935bdc013ac9a9bd406f35c3c6504a02b7379ccf622a19572eaafca6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-chronosys-doc-en;fr \
texlive-chronosys-doc"

RDEPENDS:${PN} += ""

inherit rpm
