SUMMARY = "Documentation for texlive-babel-german"
DESCRIPTION = "This package includes the documentation for texlive-babel-german"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.13svn57978"

RPM_NAME = "texlive-babel-german-doc-2023.201.2.13svn57978-53.1.noarch.rpm"
RPM_HASH = "30121c51298dcffe5e8ad491620db112bbf23bdec06b8aa0b1d06893e9eab834a9be42962dabca7dcd44bd5971dbf66cbdcb44ec6001a31974782f7fd84c6a50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-german-doc"

RDEPENDS:${PN} += ""

inherit rpm
