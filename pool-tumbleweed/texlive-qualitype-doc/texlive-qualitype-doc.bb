SUMMARY = "Documentation for texlive-qualitype"
DESCRIPTION = "This package includes the documentation for texlive-qualitype"
LICENSE = "OFL-1.1"

PV = "2023.201.svn54512"

RPM_NAME = "texlive-qualitype-doc-2023.201.svn54512-53.1.noarch.rpm"
RPM_HASH = "8800be8347547933c2fcfc149c8a22967e65067bbd6657253f5762dd045ba755a23f49acaf39481d246d3756ee747ea0d93a3ebe46e7da4068446ee7261c0b46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qualitype-doc"
RDEPENDS:${PN} += ""

inherit rpm
