SUMMARY = "Documentation for texlive-abraces"
DESCRIPTION = "This package includes the documentation for texlive-abraces"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn64967"

RPM_NAME = "texlive-abraces-doc-2023.201.2.1svn64967-54.1.noarch.rpm"
RPM_HASH = "bb82feb742150e260978c82a5bc73bb3770d830841ee296b42ab073b218cd75fb7cbd381000000d8a0a1f1e171fbd0b1dd7d840fffe98b9470d9fa2cbdebeb4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-abraces-doc"

RDEPENDS:${PN} += ""

inherit rpm
