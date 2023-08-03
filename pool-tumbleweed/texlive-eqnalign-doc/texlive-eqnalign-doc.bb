SUMMARY = "Documentation for texlive-eqnalign"
DESCRIPTION = "This package includes the documentation for texlive-eqnalign"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0asvn43278"

RPM_NAME = "texlive-eqnalign-doc-2023.209.1.0asvn43278-54.1.noarch.rpm"
RPM_HASH = "08478a097a78431c3669354e89a04a84728f3c5a23b4df1241bce8789c8e8d0fb25ce1f72e48963a329b398e114d7c9fd51720cf406b65854bbd32d4e3ce2ff0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eqnalign-doc"

RDEPENDS:${PN} += ""

inherit rpm
