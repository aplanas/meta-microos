SUMMARY = "Documentation for texlive-hindmadurai"
DESCRIPTION = "This package includes the documentation for texlive-hindmadurai"
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.0.1svn57360"

RPM_NAME = "texlive-hindmadurai-doc-2023.201.0.0.0.1svn57360-53.1.noarch.rpm"
RPM_HASH = "2a18c13e5848e28ac1e92ede5ff36c5d31808301ebb12c9fa7991507db0bf5cef4d18ec762b8d98898ed965e697585e1be393e581ca180c1b65e66a01e2a527a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hindmadurai-doc"
RDEPENDS:${PN} += ""

inherit rpm
