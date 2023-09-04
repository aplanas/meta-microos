SUMMARY = "Documentation for texlive-zhmetrics-uptex"
DESCRIPTION = "This package includes the documentation for texlive-zhmetrics-uptex"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn40728"

RPM_NAME = "texlive-zhmetrics-uptex-doc-2023.209.1.0svn40728-53.2.noarch.rpm"
RPM_HASH = "252726f1253edda494123640e818e60402a9ec3efd6e5f059ee4fbfa8e75fcefcf4c614a5df0aba840f418146f0be55ef30e718de872fea66fea49fe1fffd454"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zhmetrics-uptex-doc"

RDEPENDS:${PN} += "/usr/bin/texlua"

inherit rpm
