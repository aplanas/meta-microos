SUMMARY = "Documentation for texlive-york-thesis"
DESCRIPTION = "This package includes the documentation for texlive-york-thesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.6svn23348"

RPM_NAME = "texlive-york-thesis-doc-2023.201.3.6svn23348-52.1.noarch.rpm"
RPM_HASH = "78455b78ec3536e73e27488b0bbfdea33a83ea009e51b25a4bb3c90f631dbd7525829976e5972fe161e5669f0b54c5c35bea38e0c558eccbb5ddb768a3182721"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-york-thesis-doc"
RDEPENDS:${PN} += ""

inherit rpm
