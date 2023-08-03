SUMMARY = "Documentation for texlive-beamertheme-upenn-bc"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-upenn-bc"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn29937"

RPM_NAME = "texlive-beamertheme-upenn-bc-doc-2023.209.1.0svn29937-54.1.noarch.rpm"
RPM_HASH = "f5cf5439ea73a747df430e7266f30cb8e192c932387dc2e1ccafb539d41a1101f4dea8030652f09f1587cb1fc1768ed2a2785d405d88d7fdd37e844391b67f03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-upenn-bc-doc"

RDEPENDS:${PN} += ""

inherit rpm
