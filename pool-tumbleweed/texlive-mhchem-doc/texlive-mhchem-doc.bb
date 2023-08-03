SUMMARY = "Documentation for texlive-mhchem"
DESCRIPTION = "This package includes the documentation for texlive-mhchem"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn61456"

RPM_NAME = "texlive-mhchem-doc-2023.209.svn61456-55.1.noarch.rpm"
RPM_HASH = "55a1bff737012ca0774a99f81d3332b111ccf0c3aedd4f9d0dbe719687bf4c049b531024b61be5052f2871f70f745d7d0012435318d84b68babe1efd5a2e6583"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mhchem-doc"

RDEPENDS:${PN} += ""

inherit rpm
