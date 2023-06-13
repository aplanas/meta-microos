SUMMARY = "Documentation for texlive-combelow"
DESCRIPTION = "This package includes the documentation for texlive-combelow"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.99fsvn18462"

RPM_NAME = "texlive-combelow-doc-2023.201.0.0.99fsvn18462-53.1.noarch.rpm"
RPM_HASH = "5788f88981f3dc053060eb6a953a5cd1189ef78a77570fdee2458ea5d1db4a5c58e495332d398f06d8f43286c0f3c02050c4bd56c3c5364cd6a55e5e1a95c051"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-combelow-doc"

RDEPENDS:${PN} += ""

inherit rpm
