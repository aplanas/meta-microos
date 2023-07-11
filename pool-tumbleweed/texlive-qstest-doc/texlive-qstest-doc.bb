SUMMARY = "Documentation for texlive-qstest"
DESCRIPTION = "This package includes the documentation for texlive-qstest"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-qstest-doc-2023.201.svn15878-53.2.noarch.rpm"
RPM_HASH = "6da4beadf1531fefb4571ad7f1a798b70705096f7fed60c762514d70091284fd1a625aabf8b3116fe00cb3b279dc16f233d1288ba98b4f1a7c8e19bbd66760ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qstest-doc"

RDEPENDS:${PN} += ""

inherit rpm
