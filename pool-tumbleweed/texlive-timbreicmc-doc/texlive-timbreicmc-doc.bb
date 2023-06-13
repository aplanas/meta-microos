SUMMARY = "Documentation for texlive-timbreicmc"
DESCRIPTION = "This package includes the documentation for texlive-timbreicmc"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn49740"

RPM_NAME = "texlive-timbreicmc-doc-2023.201.2.0svn49740-52.1.noarch.rpm"
RPM_HASH = "4a9f53851489479280e48bb0a7ca8a0b4c594f6af833103aa5c4183c9bf784cdecb1bbd4e959b6b58470a3ee9dec6504863eb0dbadeacda2c92ebd4e6efbf665"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-timbreicmc-doc"

RDEPENDS:${PN} += ""

inherit rpm
