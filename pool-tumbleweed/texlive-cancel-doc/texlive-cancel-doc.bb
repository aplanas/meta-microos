SUMMARY = "Documentation for texlive-cancel"
DESCRIPTION = "This package includes the documentation for texlive-cancel"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.2.2svn32508"

RPM_NAME = "texlive-cancel-doc-2023.201.2.2svn32508-52.1.noarch.rpm"
RPM_HASH = "20c60016cd19e868333039a225f9304a3e0e9e827df586e064d9e887060ec41631360518b4e78548079c82cf3c39c44e214808bf771afa7ac3847fc8f8c17ef1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cancel-doc"

RDEPENDS:${PN} += ""

inherit rpm
