SUMMARY = "Documentation for texlive-hologo"
DESCRIPTION = "This package includes the documentation for texlive-hologo"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.15svn61719"

RPM_NAME = "texlive-hologo-doc-2023.201.1.15svn61719-53.2.noarch.rpm"
RPM_HASH = "0cc59ef44443e06c3eb39f986c1be7c9a2d332068cef5f3b3b2c08efa2f4210bc429408a7f315ebe77204a8fadc7d33302745897c072cb6815d9eceff2c148cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hologo-doc"

RDEPENDS:${PN} += ""

inherit rpm
