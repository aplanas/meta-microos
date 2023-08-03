SUMMARY = "Documentation for texlive-pst-am"
DESCRIPTION = "This package includes the documentation for texlive-pst-am"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.02svn19591"

RPM_NAME = "texlive-pst-am-doc-2023.209.1.02svn19591-53.1.noarch.rpm"
RPM_HASH = "d51bdf13cc0b149559a3fef51d8e82402c288744fd9a59ac37792797cd8605cd7097b671f404cfba8f933935b552a3c077163732ba228ab0e93e34cfe1defd17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-am-doc"

RDEPENDS:${PN} += ""

inherit rpm
