SUMMARY = "Documentation for texlive-photo"
DESCRIPTION = "This package includes the documentation for texlive-photo"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn18739"

RPM_NAME = "texlive-photo-doc-2023.209.svn18739-52.1.noarch.rpm"
RPM_HASH = "e9bbe1413d452e87dc6f98dd25d8e74fbe5f3e1a7dbeb233fc20d02ddde571f0bc85a5d6f4b46be8eaa63d47af6ee9c7f35989421d6209f0aa6f8e964e08b889"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-photo-doc"

RDEPENDS:${PN} += ""

inherit rpm
