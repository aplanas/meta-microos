SUMMARY = "Documentation for texlive-montserrat"
DESCRIPTION = "This package includes the documentation for texlive-montserrat"
LICENSE = "OFL-1.1"

PV = "2023.201.1.03svn54512"

RPM_NAME = "texlive-montserrat-doc-2023.201.1.03svn54512-54.1.noarch.rpm"
RPM_HASH = "cdb6fde13aa3b74049e63c2eb4644c3c4187a99841f452e17b7ce9c9b9f867971c5087ccdb8018666de661ff78a60f6a57129e78489409c2be9da6c3f07661f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-montserrat-doc"
RDEPENDS:${PN} += ""

inherit rpm
