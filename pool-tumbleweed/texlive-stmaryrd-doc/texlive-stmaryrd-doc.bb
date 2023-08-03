SUMMARY = "Documentation for texlive-stmaryrd"
DESCRIPTION = "This package includes the documentation for texlive-stmaryrd"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn22027"

RPM_NAME = "texlive-stmaryrd-doc-2023.209.svn22027-58.1.noarch.rpm"
RPM_HASH = "6954d08ba98406a5d054ea4378536caf4c559dd751d228b015f8bddc8f8006502a8db6209c689366ed366eba318c985a56b86153dee65411249944525873d8c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stmaryrd-doc"

RDEPENDS:${PN} += ""

inherit rpm
