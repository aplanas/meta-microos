SUMMARY = "Documentation for texlive-stage"
DESCRIPTION = "This package includes the documentation for texlive-stage"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.03svn62929"

RPM_NAME = "texlive-stage-doc-2023.209.1.03svn62929-58.1.noarch.rpm"
RPM_HASH = "82f169aa1b5eaf53ab91a3985578bc9f02de90c5ba4db4ad60296c53b1351ecea4a55e0662d69dde1d1d58098cbc83f2491a3ab14a8cb451180f00a125f646ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stage-doc"

RDEPENDS:${PN} += ""

inherit rpm
