SUMMARY = "Documentation for texlive-msc"
DESCRIPTION = "This package includes the documentation for texlive-msc"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.00svn63291"

RPM_NAME = "texlive-msc-doc-2023.209.2.00svn63291-55.1.noarch.rpm"
RPM_HASH = "f347f3009023dd49efd9bb39a024fa71528fb2ac4c5f48e8d0f6e703e2f92cc98e58dbd09713d5a655233f11b840b420b419633c60adfb102c63f78b6d5f5ba1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-msc-doc"

RDEPENDS:${PN} += ""

inherit rpm
