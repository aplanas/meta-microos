SUMMARY = "Documentation for texlive-resumemac"
DESCRIPTION = "This package includes the documentation for texlive-resumemac"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-resumemac-doc-2023.201.svn15878-53.2.noarch.rpm"
RPM_HASH = "b76e67befe21efd841d4555fa275a8a85b9a69aaf7a7ab6251694c63785f742f21bbe6fd019c1b1307ef4b019b77f58df919bc61ad9f11654b500e69ba77584d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-resumemac-doc"

RDEPENDS:${PN} += ""

inherit rpm
