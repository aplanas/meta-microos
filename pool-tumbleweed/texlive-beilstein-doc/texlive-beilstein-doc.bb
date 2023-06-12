SUMMARY = "Documentation for texlive-beilstein"
DESCRIPTION = "This package includes the documentation for texlive-beilstein"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn56193"

RPM_NAME = "texlive-beilstein-doc-2023.201.2.1svn56193-53.1.noarch.rpm"
RPM_HASH = "19a1d046fab4a88e52675a513f690f8d6741dcb7d783e8f28d533774d9f1d0d9c10d5bf463cfc7282894e33d416c09026738ef08b5eab4c4b05be1dd1f73e09c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beilstein-doc"
RDEPENDS:${PN} += ""

inherit rpm
