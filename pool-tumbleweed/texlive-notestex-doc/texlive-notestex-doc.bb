SUMMARY = "Documentation for texlive-notestex"
DESCRIPTION = "This package includes the documentation for texlive-notestex"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn45396"

RPM_NAME = "texlive-notestex-doc-2023.201.1.0svn45396-54.1.noarch.rpm"
RPM_HASH = "a9e436caebf1f2aaa1265ca780810c2343289fe2817c53804cf2d8cafe53d6c667ccfefe92ddecd56ea2083dcce6944636acb8616a67a7a2675ba39221eccbbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-notestex-doc"
RDEPENDS:${PN} += ""

inherit rpm
