SUMMARY = "Documentation for texlive-bloques"
DESCRIPTION = "This package includes the documentation for texlive-bloques"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn22490"

RPM_NAME = "texlive-bloques-doc-2023.209.1.0svn22490-53.1.noarch.rpm"
RPM_HASH = "a8c05b4d08542bd444be6597458d349e0dcbb149fb67214b0e6833945a35326988edf6fe29c7a8483c403854b698d362d0dd7f9282c950037ec07cad00f1d032"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bloques-doc"

RDEPENDS:${PN} += ""

inherit rpm
