SUMMARY = "Documentation for texlive-leftindex"
DESCRIPTION = "This package includes the documentation for texlive-leftindex"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1betasvn56182"

RPM_NAME = "texlive-leftindex-doc-2023.201.0.0.1betasvn56182-54.1.noarch.rpm"
RPM_HASH = "886f6f4c03f9c55e3c69a11161c4e82962d7c7d36ddea0e9dbb279708cfe73a54fbace366e76e732ac4e3920b62f9149394e5e299f026772f36cad44c87d3491"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-leftindex-doc"

RDEPENDS:${PN} += ""

inherit rpm
