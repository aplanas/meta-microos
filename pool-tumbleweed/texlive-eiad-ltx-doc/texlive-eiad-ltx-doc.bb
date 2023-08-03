SUMMARY = "Documentation for texlive-eiad-ltx"
DESCRIPTION = "This package includes the documentation for texlive-eiad-ltx"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-eiad-ltx-doc-2023.209.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "59cbf0ca47a3912217ea7f253049851daec6c0e80488be4707f9c414074ff1d77cc978fc2180b0b763a73cf76e815fc27cc827c2eea05825565031720b57f455"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eiad-ltx-doc"

RDEPENDS:${PN} += ""

inherit rpm
