SUMMARY = "Documentation for texlive-lion-msc"
DESCRIPTION = "This package includes the documentation for texlive-lion-msc"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.30svn55415"

RPM_NAME = "texlive-lion-msc-doc-2023.201.0.0.30svn55415-54.1.noarch.rpm"
RPM_HASH = "d4e5400f980bef43d37e0890087e8f905041864be657fbe5678e0532db34a3f825ccea1f9c05becce84bafdae32b22050b55bc8de2d03bcf3317f862de1bef26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lion-msc-doc"
RDEPENDS:${PN} += ""

inherit rpm
