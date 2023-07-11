SUMMARY = "Documentation for texlive-hindmadurai"
DESCRIPTION = "This package includes the documentation for texlive-hindmadurai"
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.0.1svn57360"

RPM_NAME = "texlive-hindmadurai-doc-2023.201.0.0.0.1svn57360-53.2.noarch.rpm"
RPM_HASH = "dae16583e3db5fd2ba5e13848f3a6c7ea65b462c9e0c9c611a46b8cba0c98ecf32b26ab83132b5ab0317f19b10ae34dc18d1be4c3143e1f5b960f4e59f9d20b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hindmadurai-doc"

RDEPENDS:${PN} += ""

inherit rpm
