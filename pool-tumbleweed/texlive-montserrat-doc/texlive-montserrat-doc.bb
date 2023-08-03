SUMMARY = "Documentation for texlive-montserrat"
DESCRIPTION = "This package includes the documentation for texlive-montserrat"
LICENSE = "OFL-1.1"

PV = "2023.209.1.03svn54512"

RPM_NAME = "texlive-montserrat-doc-2023.209.1.03svn54512-55.1.noarch.rpm"
RPM_HASH = "4f0685b771859fbf63bb5923a5679b16fcb5bb4c08267fa28407cd128840ef91be0a69a41080e79921e997c63f9216291f907fc22653f331435fba3cd3e5430c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-montserrat-doc"

RDEPENDS:${PN} += ""

inherit rpm
