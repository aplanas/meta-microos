SUMMARY = "Documentation for texlive-archivo"
DESCRIPTION = "This package includes the documentation for texlive-archivo"
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.0.2svn57283"

RPM_NAME = "texlive-archivo-doc-2023.209.0.0.0.2svn57283-55.1.noarch.rpm"
RPM_HASH = "379b6dc8582cdccd800076357872e66c622efd568c5c908ad012b051e66facf4504775dde5db12e684ace26ed73af3909b34a65f08c87a109c723132cf89d5a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-archivo-doc"

RDEPENDS:${PN} += ""

inherit rpm
