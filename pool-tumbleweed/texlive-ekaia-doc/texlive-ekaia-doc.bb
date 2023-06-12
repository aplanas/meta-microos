SUMMARY = "Documentation for texlive-ekaia"
DESCRIPTION = "This package includes the documentation for texlive-ekaia"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.06svn49594"

RPM_NAME = "texlive-ekaia-doc-2023.201.1.06svn49594-53.1.noarch.rpm"
RPM_HASH = "bcb80d56276efe2b3907adf97960a5e4506e699bc1d7ca59b6e2cbaafb5693d5bcb93ac36802ce692db2e2ce108dd6095017032b5cd033112f3f34422a2e7ce2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ekaia-doc"
RDEPENDS:${PN} += ""

inherit rpm
