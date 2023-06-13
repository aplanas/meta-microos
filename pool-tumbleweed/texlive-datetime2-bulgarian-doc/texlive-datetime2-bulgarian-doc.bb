SUMMARY = "Documentation for texlive-datetime2-bulgarian"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-bulgarian"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn47031"

RPM_NAME = "texlive-datetime2-bulgarian-doc-2023.201.1.1svn47031-52.1.noarch.rpm"
RPM_HASH = "84b4e617c598162b9be4244dc15bf6e25eb3d72220bff9e2e423cb6f770d2fdfee59405491c1b06eaac9dbc825a4273ee3d2152a70265e25b1947125573db2fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-bulgarian-doc"

RDEPENDS:${PN} += ""

inherit rpm
