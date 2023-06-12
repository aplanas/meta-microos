SUMMARY = "Documentation for texlive-zhmetrics"
DESCRIPTION = "This package includes the documentation for texlive-zhmetrics"
LICENSE = "LPPL-1.0"

PV = "2023.201.r206svn22207"

RPM_NAME = "texlive-zhmetrics-doc-2023.201.r206svn22207-52.1.noarch.rpm"
RPM_HASH = "b00398bceaa00306824f9f1c1ed09a24049e6c153b731fc5445641daeb8dc98097b3fd84694a575f87e88d284cf43372f1e885b60623e273faf3528af081b176"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zhmetrics-doc"
RDEPENDS:${PN} += ""

inherit rpm
