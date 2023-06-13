SUMMARY = "Documentation for texlive-ibrackets"
DESCRIPTION = "This package includes the documentation for texlive-ibrackets"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn65383"

RPM_NAME = "texlive-ibrackets-doc-2023.201.1.1svn65383-52.1.noarch.rpm"
RPM_HASH = "5275e532a8faa664809bdff55a2b3ed2c9dd4c1d56fc107fb494fd65685fe8e121f9bd3492e81ab63ef9c3a5f6e644c0fc9a017012418a4daa2816d314be8cf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ibrackets-doc"

RDEPENDS:${PN} += ""

inherit rpm
