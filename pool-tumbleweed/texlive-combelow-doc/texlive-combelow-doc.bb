SUMMARY = "Documentation for texlive-combelow"
DESCRIPTION = "This package includes the documentation for texlive-combelow"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.99fsvn18462"

RPM_NAME = "texlive-combelow-doc-2023.209.0.0.99fsvn18462-54.1.noarch.rpm"
RPM_HASH = "386fec9700341b2f00359a94a5e6c956f71968cccfdd6d89550f88b3ad885eb9bda8e433b8e3ac412e81b15c70fe64b3e962dd5c0ab3eae1ecb50a7588f5c221"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-combelow-doc"

RDEPENDS:${PN} += ""

inherit rpm
