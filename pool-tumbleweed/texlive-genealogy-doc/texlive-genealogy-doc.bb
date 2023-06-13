SUMMARY = "Documentation for texlive-genealogy"
DESCRIPTION = "This package includes the documentation for texlive-genealogy"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn25112"

RPM_NAME = "texlive-genealogy-doc-2023.201.svn25112-52.1.noarch.rpm"
RPM_HASH = "a9a318aa43dfc21d426f571b0f48fe69d189762676e8c90dd7d2e58d42fb68800b4e6f8002fb0e2c3a702f24fe3e9abf5c1c090dbc99e700d293a2453a11d890"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-genealogy-doc"

RDEPENDS:${PN} += ""

inherit rpm
