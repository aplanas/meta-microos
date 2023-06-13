SUMMARY = "Documentation for texlive-bxdvidriver"
DESCRIPTION = "This package includes the documentation for texlive-bxdvidriver"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2asvn43219"

RPM_NAME = "texlive-bxdvidriver-doc-2023.201.0.0.2asvn43219-52.1.noarch.rpm"
RPM_HASH = "3a9c5d951d1a8021b61f0bbc41ce7abbca012508271b93e5c716a5ad2e1bc6904b9918036dd3d5f662856cdb1ca819f7a9d0c6bc3fd9db42c66ccea4d7877382"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bxdvidriver-doc"

RDEPENDS:${PN} += ""

inherit rpm
