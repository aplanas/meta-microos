SUMMARY = "Documentation for texlive-templatetools"
DESCRIPTION = "This package includes the documentation for texlive-templatetools"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn34495"

RPM_NAME = "texlive-templatetools-doc-2023.209.svn34495-55.1.noarch.rpm"
RPM_HASH = "ed7cbf2770cb46333fa2999f999ccdcad15c6c7195f73899b343f67f907dd480e931651bb63db8fc3d486b4403f8f827edbcccf32ddfd06895534ce1efb76446"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-templatetools-doc"

RDEPENDS:${PN} += ""

inherit rpm
