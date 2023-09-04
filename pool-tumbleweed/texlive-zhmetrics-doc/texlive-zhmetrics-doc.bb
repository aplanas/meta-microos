SUMMARY = "Documentation for texlive-zhmetrics"
DESCRIPTION = "This package includes the documentation for texlive-zhmetrics"
LICENSE = "LPPL-1.0"

PV = "2023.209.r206svn22207"

RPM_NAME = "texlive-zhmetrics-doc-2023.209.r206svn22207-53.2.noarch.rpm"
RPM_HASH = "9686837f516be4c9926fa100c59eebe9c4045221d5fcdaf237a1f077e8052013893e4b0796bd9f6a775d90d21ad574f3e4d80290346d2a374a3f8b7c537ed646"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zhmetrics-doc"

RDEPENDS:${PN} += ""

inherit rpm
