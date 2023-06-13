SUMMARY = "Documentation for texlive-numberpt"
DESCRIPTION = "This package includes the documentation for texlive-numberpt"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn51640"

RPM_NAME = "texlive-numberpt-doc-2023.201.1.0svn51640-54.1.noarch.rpm"
RPM_HASH = "b70a46dd807ee5f1b95233497d3856deb4a53615ed11fb91a90e5a601c50aa09fd11cfc4341a45720a40f729f12f722d43e5424980a37a06c97ed2d116177aa3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-numberpt-doc"

RDEPENDS:${PN} += ""

inherit rpm
