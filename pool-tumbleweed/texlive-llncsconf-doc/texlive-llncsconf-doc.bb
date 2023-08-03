SUMMARY = "Documentation for texlive-llncsconf"
DESCRIPTION = "This package includes the documentation for texlive-llncsconf"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.0svn63136"

RPM_NAME = "texlive-llncsconf-doc-2023.209.1.2.0svn63136-55.1.noarch.rpm"
RPM_HASH = "cedb6b8f1dd9ad9652b296c9a4b0b593609a82483b87c10a513e82f4da0e9fd7b9c3abf84891dad3d5d1d4263d29fc8cb7bfc111f8db422e25f4777e87452e54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-llncsconf-doc"

RDEPENDS:${PN} += ""

inherit rpm
