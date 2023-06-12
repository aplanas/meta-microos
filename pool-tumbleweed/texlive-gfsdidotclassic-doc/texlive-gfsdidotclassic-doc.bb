SUMMARY = "Documentation for texlive-gfsdidotclassic"
DESCRIPTION = "This package includes the documentation for texlive-gfsdidotclassic"
LICENSE = "OFL-1.1"

PV = "2023.201.001.001svn52778"

RPM_NAME = "texlive-gfsdidotclassic-doc-2023.201.001.001svn52778-52.1.noarch.rpm"
RPM_HASH = "7be41173aa96d4525298ab993f95b3af2623a943aebb55ff3ea25f1921a32259b4cd9a9d40dd7e02240036cc6b09efec2880e54b3e0ebbb50d85a8072c1fb29c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gfsdidotclassic-doc"
RDEPENDS:${PN} += ""

inherit rpm
