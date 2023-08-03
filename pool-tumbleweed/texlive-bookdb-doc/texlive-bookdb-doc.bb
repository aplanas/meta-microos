SUMMARY = "Documentation for texlive-bookdb"
DESCRIPTION = "This package includes the documentation for texlive-bookdb"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn37536"

RPM_NAME = "texlive-bookdb-doc-2023.209.0.0.2svn37536-53.1.noarch.rpm"
RPM_HASH = "17f068baabaea0608e583f34771942b97ab8002bb87ef87e4b8ffb7721f879d77d86ed0f173d99a2d9b416f9b0f179565cb2155bac8b934b52daee405668f5a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bookdb-doc"

RDEPENDS:${PN} += ""

inherit rpm
