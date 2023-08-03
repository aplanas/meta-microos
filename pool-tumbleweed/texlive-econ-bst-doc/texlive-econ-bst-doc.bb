SUMMARY = "Documentation for texlive-econ-bst"
DESCRIPTION = "This package includes the documentation for texlive-econ-bst"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.1.1svn61499"

RPM_NAME = "texlive-econ-bst-doc-2023.209.3.1.1svn61499-54.1.noarch.rpm"
RPM_HASH = "98b0963720300753df5e8a7706bc430b48b3e14e18ff80fd02dbf82004f74ffa375ab53925ba090a5121390ead6dbc6efed4d021a7039cd03b0e7723358a6fa1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-econ-bst-doc"

RDEPENDS:${PN} += ""

inherit rpm
