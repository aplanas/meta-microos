SUMMARY = "Documentation for texlive-cjkpunct"
DESCRIPTION = "This package includes the documentation for texlive-cjkpunct"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.8.4svn41119"

RPM_NAME = "texlive-cjkpunct-doc-2023.201.4.8.4svn41119-53.1.noarch.rpm"
RPM_HASH = "97a35748189c43fc4a382294283796d9cf71540315141f4e3a6de9776b9502156d64c774ea55286181953c42182589301cc9015527421abf51e1f087e8f51aff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cjkpunct-doc"
RDEPENDS:${PN} += ""

inherit rpm
