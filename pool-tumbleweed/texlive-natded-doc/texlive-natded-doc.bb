SUMMARY = "Documentation for texlive-natded"
DESCRIPTION = "This package includes the documentation for texlive-natded"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn32693"

RPM_NAME = "texlive-natded-doc-2023.201.0.0.1svn32693-54.1.noarch.rpm"
RPM_HASH = "ab419893fae4a7ef011515c8ec4b77167ab34ad6573f57d2769bcfab9cd88b56c7d8dc7acaa03b3f9c13de1e3e1cb38b16986df4af6bbaf75d849c65702858bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-natded-doc"
RDEPENDS:${PN} += ""

inherit rpm
