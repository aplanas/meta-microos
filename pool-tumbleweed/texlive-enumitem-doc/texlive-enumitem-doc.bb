SUMMARY = "Documentation for texlive-enumitem"
DESCRIPTION = "This package includes the documentation for texlive-enumitem"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.9svn51423"

RPM_NAME = "texlive-enumitem-doc-2023.209.3.9svn51423-54.2.noarch.rpm"
RPM_HASH = "07bce283b5a6a72a393c67829ae60c71a02d05bcc7269db147968a8cfe03a2171e57d2491abf83d9ae227828b58108f2fd1914e83ff8a5a26c7e0ab6dc049721"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-enumitem-doc"

RDEPENDS:${PN} += ""

inherit rpm
