SUMMARY = "Documentation for texlive-csassignments"
DESCRIPTION = "This package includes the documentation for texlive-csassignments"
LICENSE = "LPPL-1.0"

PV = "2023.204.1.0.2svn63992"

RPM_NAME = "texlive-csassignments-doc-2023.204.1.0.2svn63992-54.1.noarch.rpm"
RPM_HASH = "94794781bd580c773c75318a7998d30d75200736225ae18236b4addb9dc5518e1986b8263735056a2080126140a8a1d99799e3dcfbe378aaa1bb30fb485e31cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-csassignments-doc"
RDEPENDS:${PN} += ""

inherit rpm
