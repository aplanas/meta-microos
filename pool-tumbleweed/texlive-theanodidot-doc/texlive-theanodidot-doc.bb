SUMMARY = "Documentation for texlive-theanodidot"
DESCRIPTION = "This package includes the documentation for texlive-theanodidot"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn64518"

RPM_NAME = "texlive-theanodidot-doc-2023.201.svn64518-54.1.noarch.rpm"
RPM_HASH = "8d65f5222b8b31c1ee51499c2e19ce3bf7d2e3b6f5e6b3e118e7875124e10ff516a393fc9626d0382faea23c9437129ed49c95b63b7ef0b808aca4ba86d8c837"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-theanodidot-doc"

RDEPENDS:${PN} += ""

inherit rpm
