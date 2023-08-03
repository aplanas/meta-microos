SUMMARY = "Documentation for texlive-qstest"
DESCRIPTION = "This package includes the documentation for texlive-qstest"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-qstest-doc-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "83e1fa1dadc0da3834c5a614438913a9f08e4fdf1a6cc2093347a5a4f434c15551ab198dbf2a1c589ca28243d5a330d49c3de7001cd03616a1953529d4d682f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qstest-doc"

RDEPENDS:${PN} += ""

inherit rpm
