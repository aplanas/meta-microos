SUMMARY = "Documentation for texlive-parskip"
DESCRIPTION = "This package includes the documentation for texlive-parskip"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0hsvn58358"

RPM_NAME = "texlive-parskip-doc-2023.201.2.0hsvn58358-51.1.noarch.rpm"
RPM_HASH = "fabd8fba242594673444931b8d240c1b36067db3d0d49cae178b18d27a923d4b354275a9307e0febbffed94c0a70a0c7d3d9e905dba45a34e32b869e349e17b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-parskip-doc"

RDEPENDS:${PN} += ""

inherit rpm
