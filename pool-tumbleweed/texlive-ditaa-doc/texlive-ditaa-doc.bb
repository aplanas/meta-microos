SUMMARY = "Documentation for texlive-ditaa"
DESCRIPTION = "This package includes the documentation for texlive-ditaa"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9svn48932"

RPM_NAME = "texlive-ditaa-doc-2023.201.0.0.9svn48932-52.1.noarch.rpm"
RPM_HASH = "e7eeb0c4b9ee36b9f7ede26349ea456f2c9704934b7d89c8b62d7e6bf534987e817315cb108040fb3ebf4fd341b1b62016a3c10de9e9bec6e5f993dfb9bdd479"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ditaa-doc"

RDEPENDS:${PN} += ""

inherit rpm
