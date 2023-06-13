SUMMARY = "Documentation for texlive-semioneside"
DESCRIPTION = "This package includes the documentation for texlive-semioneside"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.41svn15878"

RPM_NAME = "texlive-semioneside-doc-2023.201.0.0.41svn15878-53.1.noarch.rpm"
RPM_HASH = "f31c63e3665d484764343c529fd12c6c417e7323bbb00598692f7a435c8e1063f9a3347c6b31724b22c1f76027598560b789086e690843cd1d32a205237360a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-semioneside-doc"

RDEPENDS:${PN} += ""

inherit rpm
