SUMMARY = "Documentation for texlive-upca"
DESCRIPTION = "This package includes the documentation for texlive-upca"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn22511"

RPM_NAME = "texlive-upca-doc-2023.201.svn22511-53.1.noarch.rpm"
RPM_HASH = "14a53791452359dc561508a9ab720dbdf39bdebbac2f05bf7c2c19e2aa2f932dcb9f7d57f19ac6267f67ebd3e50d40a248743ec11fbff19402d15b343d07c53f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-upca-doc"

RDEPENDS:${PN} += ""

inherit rpm
