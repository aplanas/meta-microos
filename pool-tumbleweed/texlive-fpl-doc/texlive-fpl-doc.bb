SUMMARY = "Documentation for texlive-fpl"
DESCRIPTION = "This package includes the documentation for texlive-fpl"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.003svn54512"

RPM_NAME = "texlive-fpl-doc-2023.201.1.003svn54512-52.1.noarch.rpm"
RPM_HASH = "c36ab6064812671cc3df587af844e113f6d4eb78fa07d19aae7755000fed8f96c34a39dcef41bc659d901e35bd66b88ba0e2636d2756c365cd6e9164df60f850"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fpl-doc"

RDEPENDS:${PN} += ""

inherit rpm
