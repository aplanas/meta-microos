SUMMARY = "Documentation for texlive-makebarcode"
DESCRIPTION = "This package includes the documentation for texlive-makebarcode"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-makebarcode-doc-2023.201.1.0svn15878-52.1.noarch.rpm"
RPM_HASH = "5fcdcc5c8b1c9adb2c1a6cf7b8db8daa31e2969aad38e2419c8f78a2a724c4f774b2bb3fc9755783ff42c7f77b31f9c7ba3cc86445bbb72091c750b14f1d1abc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-makebarcode-doc"
RDEPENDS:${PN} += ""

inherit rpm
