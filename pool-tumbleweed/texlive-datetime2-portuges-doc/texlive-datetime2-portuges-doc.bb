SUMMARY = "Documentation for texlive-datetime2-portuges"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-portuges"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn48457"

RPM_NAME = "texlive-datetime2-portuges-doc-2023.201.1.1svn48457-52.1.noarch.rpm"
RPM_HASH = "e4699aa35292339b0503324b4f91c98f7af3638ac9ba7cea062f086aa515f395c73afe442c18c54d9d9f58394df0fbd573859342548fdbf667d80acce99e48d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-portuges-doc"

RDEPENDS:${PN} += ""

inherit rpm
