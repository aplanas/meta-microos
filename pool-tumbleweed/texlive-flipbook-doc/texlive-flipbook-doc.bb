SUMMARY = "Documentation for texlive-flipbook"
DESCRIPTION = "This package includes the documentation for texlive-flipbook"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn25584"

RPM_NAME = "texlive-flipbook-doc-2023.209.0.0.2svn25584-53.1.noarch.rpm"
RPM_HASH = "700d71083775a1b84176d0a2e5d3d939ae9c01ac0c773c2be6cae501813ab8a83a6440727bd37668b0fa73aa87f9bada43d18720c7f412c4d790dfbb5af90c9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-flipbook-doc"

RDEPENDS:${PN} += ""

inherit rpm
