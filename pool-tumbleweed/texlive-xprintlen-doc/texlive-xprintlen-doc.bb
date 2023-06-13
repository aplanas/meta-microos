SUMMARY = "Documentation for texlive-xprintlen"
DESCRIPTION = "This package includes the documentation for texlive-xprintlen"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn35928"

RPM_NAME = "texlive-xprintlen-doc-2023.201.1.0svn35928-52.1.noarch.rpm"
RPM_HASH = "8670cc0a3c4939a5a6669fb27aaffef68e856812cb607ca8b35d58e6da626b4404fd1d7602903df845e0d9644d85a37f4de7812bd5957668782060e8ba1cb860"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xprintlen-doc"

RDEPENDS:${PN} += ""

inherit rpm
