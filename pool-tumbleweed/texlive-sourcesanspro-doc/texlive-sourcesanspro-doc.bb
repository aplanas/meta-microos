SUMMARY = "Documentation for texlive-sourcesanspro"
DESCRIPTION = "This package includes the documentation for texlive-sourcesanspro"
LICENSE = "OFL-1.1"

PV = "2023.209.2.8svn54892"

RPM_NAME = "texlive-sourcesanspro-doc-2023.209.2.8svn54892-58.1.noarch.rpm"
RPM_HASH = "9b8f53c63b6d5233ab6d2aeffd2f473cf72bc81aea9b6fdde1851c153d2d781a1eff543b186729f5ea5a2ded322594854cde12df386d707a83e747506ee99551"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sourcesanspro-doc"

RDEPENDS:${PN} += ""

inherit rpm
