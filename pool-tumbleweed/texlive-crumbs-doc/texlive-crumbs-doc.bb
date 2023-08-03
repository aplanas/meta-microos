SUMMARY = "Documentation for texlive-crumbs"
DESCRIPTION = "This package includes the documentation for texlive-crumbs"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4.1svn64602"

RPM_NAME = "texlive-crumbs-doc-2023.209.0.0.4.1svn64602-55.1.noarch.rpm"
RPM_HASH = "545d732636ef390c4a0f0adfdd5b9c1142bb7d3e0cb99b485269bd42aabe949a9e4cb0c1c7759798f7630b701adf3335944b8ea82a626fe06e7a4b94fae69653"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-crumbs-doc"

RDEPENDS:${PN} += ""

inherit rpm
