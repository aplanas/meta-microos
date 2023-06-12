SUMMARY = "Documentation for texlive-hyperbar"
DESCRIPTION = "This package includes the documentation for texlive-hyperbar"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn48147"

RPM_NAME = "texlive-hyperbar-doc-2023.201.0.0.1svn48147-52.1.noarch.rpm"
RPM_HASH = "eb34e8d5984cc51943c6010059384254a7caac50734aa4ac2c70794f61a85b4119fc56a4bbe8a94a6a482db3c60f34bad28151d3c043373dabdf2693214f898e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hyperbar-doc"
RDEPENDS:${PN} += ""

inherit rpm
