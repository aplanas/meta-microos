SUMMARY = "Documentation for texlive-pst-sigsys"
DESCRIPTION = "This package includes the documentation for texlive-pst-sigsys"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn21667"

RPM_NAME = "texlive-pst-sigsys-doc-2023.201.1.4svn21667-53.2.noarch.rpm"
RPM_HASH = "7acc1c4d2cbed124a30c55a536d221990b0c07b385368336f09fadfbf8fad02905c5a9fb20dddfd263c5de5e616fca1e05b7a0420e384e0041a65238aa532792"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-sigsys-doc"

RDEPENDS:${PN} += ""

inherit rpm
