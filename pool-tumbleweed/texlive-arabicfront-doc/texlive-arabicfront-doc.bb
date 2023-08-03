SUMMARY = "Documentation for texlive-arabicfront"
DESCRIPTION = "This package includes the documentation for texlive-arabicfront"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn51474"

RPM_NAME = "texlive-arabicfront-doc-2023.209.1.1svn51474-55.1.noarch.rpm"
RPM_HASH = "8d458b0d866c782de1da7b35f5bddcae55043c2ceb1a3cc270e949aabc4bdefe54a5d50860366b3684785b126989e7452f2590c845cef08c0cfb5b77224a03db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arabicfront-doc"

RDEPENDS:${PN} += ""

inherit rpm
