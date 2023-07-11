SUMMARY = "Documentation for texlive-glossaries-german"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-german"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn35665"

RPM_NAME = "texlive-glossaries-german-doc-2023.201.1.0svn35665-53.2.noarch.rpm"
RPM_HASH = "3d21e0c5a24f801707c0d6ec1315642b18cd1a35dc794359f2174b2a102c7f97573387dc95121279eabb8e3944f45c00ad144b78134c018bbeaff12d6f2fb716"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-german-doc"

RDEPENDS:${PN} += ""

inherit rpm
