SUMMARY = "Documentation for texlive-gindex"
DESCRIPTION = "This package includes the documentation for texlive-gindex"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn52311"

RPM_NAME = "texlive-gindex-doc-2023.209.0.0.2svn52311-53.1.noarch.rpm"
RPM_HASH = "080ee32e804bab27e1a6af213b6c1a04d4cc3406d0531699747ecfb9b5c024b8359a93405654e9432bd26d2b69a62de4268bbf326ccbf10e9f39838a90d0dcdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gindex-doc"

RDEPENDS:${PN} += ""

inherit rpm
