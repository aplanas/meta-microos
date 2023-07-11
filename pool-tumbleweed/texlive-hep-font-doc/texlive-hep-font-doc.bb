SUMMARY = "Documentation for texlive-hep-font"
DESCRIPTION = "This package includes the documentation for texlive-hep-font"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn64900"

RPM_NAME = "texlive-hep-font-doc-2023.201.1.1svn64900-53.2.noarch.rpm"
RPM_HASH = "a813cd5cf6049405e6331fa8eab464e3254edef3d75b7d2036da42818695eb5795d822ba248424e13dc1505ee8f182a7ce0b9eab25227cadaef2ae2ff3afe8ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-font-doc"

RDEPENDS:${PN} += ""

inherit rpm
