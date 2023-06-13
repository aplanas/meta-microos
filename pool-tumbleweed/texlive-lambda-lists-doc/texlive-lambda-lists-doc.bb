SUMMARY = "Documentation for texlive-lambda-lists"
DESCRIPTION = "This package includes the documentation for texlive-lambda-lists"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn31402"

RPM_NAME = "texlive-lambda-lists-doc-2023.201.svn31402-55.1.noarch.rpm"
RPM_HASH = "9f3f395b2f8052c8880228c2853e3ff48ec75f8da69ef161061860b314901209b5b1af92a65311394339586d392cdedea1542b5238d5cef3a17127f52dd4179d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lambda-lists-doc"

RDEPENDS:${PN} += ""

inherit rpm
