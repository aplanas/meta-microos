SUMMARY = "Documentation for texlive-multicap"
DESCRIPTION = "This package includes the documentation for texlive-multicap"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-multicap-doc-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "ac396700dd7f75def4ba66ad0ebb61d1518b4936c01d3aedc1774ce801a3e7373b885b0555a7fe4e1f6801982af72f7a5c37dfb082f65babbea6ad5869aee4f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-multicap-doc"

RDEPENDS:${PN} += ""

inherit rpm
