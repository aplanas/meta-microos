SUMMARY = "Documentation for texlive-datetime"
DESCRIPTION = "This package includes the documentation for texlive-datetime"
LICENSE = "LPPL-1.0"

PV = "2023.204.2.60svn36650"

RPM_NAME = "texlive-datetime-doc-2023.204.2.60svn36650-54.1.noarch.rpm"
RPM_HASH = "1b499c97cd5bd512286a248e7b41548587ab5da4b8489d3c31e550b866d102c94a03bcc93d3c37aaa75f6f004d549bbf1668099815c9fdb8525a6d915f77f96c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime-doc"

RDEPENDS:${PN} += ""

inherit rpm
