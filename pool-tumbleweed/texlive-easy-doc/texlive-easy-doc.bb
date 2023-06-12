SUMMARY = "Documentation for texlive-easy"
DESCRIPTION = "This package includes the documentation for texlive-easy"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.99svn19440"

RPM_NAME = "texlive-easy-doc-2023.201.0.0.99svn19440-53.1.noarch.rpm"
RPM_HASH = "07630aa2c75f5c63fb7e5c4bbec932e16ec577ce6be1f565f6edf8cd766b1732f5d7e3349b61caa49162d70c3e92ad6ebb7ce5bb84002bcc42de720b61e8dc4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-easy-doc"
RDEPENDS:${PN} += ""

inherit rpm
