SUMMARY = "Documentation for texlive-babel-serbian"
DESCRIPTION = "This package includes the documentation for texlive-babel-serbian"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2asvn64571"

RPM_NAME = "texlive-babel-serbian-doc-2023.201.2.2asvn64571-53.1.noarch.rpm"
RPM_HASH = "bf41cb0e9aae158b266c2841ecf1c6c5b0d5612cfb1aeace56cdce1a2ad696120234b2a94bc8c40fe8c6de0397b6d40e53e68405273edd933d195a8820b6c3e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-serbian-doc"

RDEPENDS:${PN} += ""

inherit rpm
