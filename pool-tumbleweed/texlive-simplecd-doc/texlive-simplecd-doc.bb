SUMMARY = "Documentation for texlive-simplecd"
DESCRIPTION = "This package includes the documentation for texlive-simplecd"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn29260"

RPM_NAME = "texlive-simplecd-doc-2023.201.1.4svn29260-53.1.noarch.rpm"
RPM_HASH = "9a53ffbfeca1277768e117a8640011284500c86176fd7fcd03f3ade4a5dbabd5cff53bdb45ab876b8cf795e56a7ed2b787b8c3a443aebd7dd48e45043323655f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-simplecd-doc"

RDEPENDS:${PN} += ""

inherit rpm
