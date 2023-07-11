SUMMARY = "Documentation for texlive-harnon-cv"
DESCRIPTION = "This package includes the documentation for texlive-harnon-cv"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.0svn26543"

RPM_NAME = "texlive-harnon-cv-doc-2023.201.1.0svn26543-53.2.noarch.rpm"
RPM_HASH = "c2055a0a6be9dd045fd426600878114b9b13c258a580a2bd411c8260dd19f1e398306fbe339ae1425214e243347bc03ec83d936f7ee70f583e47ba8d63754f3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-harnon-cv-doc"

RDEPENDS:${PN} += ""

inherit rpm
