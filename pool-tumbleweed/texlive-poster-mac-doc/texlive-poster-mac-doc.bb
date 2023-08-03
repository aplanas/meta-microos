SUMMARY = "Documentation for texlive-poster-mac"
DESCRIPTION = "This package includes the documentation for texlive-poster-mac"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn18305"

RPM_NAME = "texlive-poster-mac-doc-2023.209.1.1svn18305-53.1.noarch.rpm"
RPM_HASH = "8b94173ffe7821802423ada7dbfd5cbac4634d8d2eeb28d5d3e80a7a902b7f360254570e87d9e28331c1b9e84dbdfad744a7d3868832c346db7b7942f8fb717a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-poster-mac-doc"

RDEPENDS:${PN} += ""

inherit rpm
