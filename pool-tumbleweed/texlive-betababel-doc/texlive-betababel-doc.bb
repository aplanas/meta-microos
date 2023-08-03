SUMMARY = "Documentation for texlive-betababel"
DESCRIPTION = "This package includes the documentation for texlive-betababel"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn15878"

RPM_NAME = "texlive-betababel-doc-2023.209.0.0.5svn15878-54.1.noarch.rpm"
RPM_HASH = "17333e015344aec9f5170ca4208bb31ae27c24ea40b71c98f8251bd22dd0c52e8338b4d60bac46f25588004096d85a81edad6966f3c139a28e3003a7fb09bfe3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-betababel-doc"

RDEPENDS:${PN} += ""

inherit rpm
