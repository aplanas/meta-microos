SUMMARY = "Documentation for texlive-b1encoding"
DESCRIPTION = "This package includes the documentation for texlive-b1encoding"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn21271"

RPM_NAME = "texlive-b1encoding-doc-2023.201.1.0svn21271-53.1.noarch.rpm"
RPM_HASH = "dfeea0b313f5e962b3a01216daf85fd131061cf08422f89a6de6b935a653058d02e039fef0d686c6270ce7ce59a8bf0e3bddcd22e9bf73f8e7051f4d392fa834"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-b1encoding-doc"

RDEPENDS:${PN} += ""

inherit rpm
