SUMMARY = "Documentation for texlive-drv"
DESCRIPTION = "This package includes the documentation for texlive-drv"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.97svn29349"

RPM_NAME = "texlive-drv-doc-2023.201.0.0.97svn29349-52.1.noarch.rpm"
RPM_HASH = "b829179fffb6cf9b20e27da0eacd1747f0ad9c7456ba362426ae977da71e99b0ac2d9fbcdf7bed38bc248b956c32fc702124f640ea38684f43889f2cd768f3c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-drv-doc"

RDEPENDS:${PN} += ""

inherit rpm
