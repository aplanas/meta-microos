SUMMARY = "Documentation for texlive-pxtxalfa"
DESCRIPTION = "This package includes the documentation for texlive-pxtxalfa"
LICENSE = "LPPL-1.0"

PV = "2023.201.2svn60847"

RPM_NAME = "texlive-pxtxalfa-doc-2023.201.2svn60847-53.1.noarch.rpm"
RPM_HASH = "95a1151ac26c4efc16f907b4f1416de12dde048777550fcddb9500e019dda175285ebb064fd9d4ec03e3e8cfc1d9396e386112c6237ce6480f286475b269bbc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pxtxalfa-doc"

RDEPENDS:${PN} += ""

inherit rpm
