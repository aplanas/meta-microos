SUMMARY = "Documentation for texlive-raleway"
DESCRIPTION = "This package includes the documentation for texlive-raleway"
LICENSE = "OFL-1.1"

PV = "2023.201.1.4svn42629"

RPM_NAME = "texlive-raleway-doc-2023.201.1.4svn42629-53.1.noarch.rpm"
RPM_HASH = "6ee2cd7e715155eb1e2a23ab6fe8ed98513742d0d927c403b048b19c444acdd4f6d08110649c6869b0c642e4acd7fe1e1231f0a36bd7dcdb8071684110d5fa75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-raleway-doc"
RDEPENDS:${PN} += ""

inherit rpm
