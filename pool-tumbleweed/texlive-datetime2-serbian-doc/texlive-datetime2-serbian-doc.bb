SUMMARY = "Documentation for texlive-datetime2-serbian"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-serbian"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1.0svn52893"

RPM_NAME = "texlive-datetime2-serbian-doc-2023.201.2.1.0svn52893-52.1.noarch.rpm"
RPM_HASH = "a43e3890ed19518d315832e7208caaa7d5bd691f4c7bdedbb0bccb772e2faefe5d6f51abacd7ee5b67a8e6c100ef64104c286bb07d2beef04bf2e1a22091307b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-serbian-doc"

RDEPENDS:${PN} += ""

inherit rpm
