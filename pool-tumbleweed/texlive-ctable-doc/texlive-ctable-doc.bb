SUMMARY = "Documentation for texlive-ctable"
DESCRIPTION = "This package includes the documentation for texlive-ctable"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.31svn38672"

RPM_NAME = "texlive-ctable-doc-2023.209.1.31svn38672-55.1.noarch.rpm"
RPM_HASH = "40398939af941d0619b674f0db83b5cc860c00bd07f2565af51cd95c41de4fc4f867c5883c4531ed7008524bc3bf44361685015912584853e4a5d4195dbb0cb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ctable-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
