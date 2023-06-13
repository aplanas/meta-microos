SUMMARY = "Documentation for texlive-footmisc"
DESCRIPTION = "This package includes the documentation for texlive-footmisc"
LICENSE = "LPPL-1.0"

PV = "2023.201.6.0dsvn62524"

RPM_NAME = "texlive-footmisc-doc-2023.201.6.0dsvn62524-52.1.noarch.rpm"
RPM_HASH = "6e7e6e0b0101a7a0cae620b6aace187effc234e2fd0b90d41b37f0f042c46adfe1bfe757a9ee19ccdb733895160c205ac2de7c22de71b14544c764ff0a30e3c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-footmisc-doc"

RDEPENDS:${PN} += ""

inherit rpm
