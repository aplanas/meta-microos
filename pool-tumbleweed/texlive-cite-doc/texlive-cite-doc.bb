SUMMARY = "Documentation for texlive-cite"
DESCRIPTION = "This package includes the documentation for texlive-cite"
LICENSE = "LPPL-1.0"

PV = "2023.201.5.5svn36428"

RPM_NAME = "texlive-cite-doc-2023.201.5.5svn36428-53.1.noarch.rpm"
RPM_HASH = "efaf73bd0e66f3f33f8ffbee0eb888f147ea2f00f87a9c3e404d5090ca18638f8b761aca44ba13a77dcffa29e4e34ca3fbd70a18213ee4cdd303ea2bc2352dbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cite-doc"

RDEPENDS:${PN} += ""

inherit rpm
