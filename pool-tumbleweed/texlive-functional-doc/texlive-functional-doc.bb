SUMMARY = "Documentation for texlive-functional"
DESCRIPTION = "This package includes the documentation for texlive-functional"
LICENSE = "LPPL-1.0"

PV = "2023.209.2023asvn65485"

RPM_NAME = "texlive-functional-doc-2023.209.2023asvn65485-53.1.noarch.rpm"
RPM_HASH = "fafb3e13ea797d5d53b2e2eeca09403386150057dca26ff07c30e05f0246c390cb956bdd4b50a87ea1f43fb573248e3d46efe0f5619a3608634701d8bf871e85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-functional-doc"

RDEPENDS:${PN} += ""

inherit rpm
