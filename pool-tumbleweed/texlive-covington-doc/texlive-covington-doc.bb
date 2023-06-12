SUMMARY = "Documentation for texlive-covington"
DESCRIPTION = "This package includes the documentation for texlive-covington"
LICENSE = "LPPL-1.0"

PV = "2023.204.2.8svn64241"

RPM_NAME = "texlive-covington-doc-2023.204.2.8svn64241-54.1.noarch.rpm"
RPM_HASH = "3a3e851e33a5b3c9705a4e71085eefd42bc61b6592aa9b445878da014baf2793f440e3b35b007e1e7914948c0d2352a2fd6d76b6a695f5c8b9890070798ef12c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-covington-doc"
RDEPENDS:${PN} += ""

inherit rpm
