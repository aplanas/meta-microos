SUMMARY = "Documentation for texlive-soton"
DESCRIPTION = "This package includes the documentation for texlive-soton"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn16215"

RPM_NAME = "texlive-soton-doc-2023.201.0.0.1svn16215-57.1.noarch.rpm"
RPM_HASH = "cf7a7d604fa83b79502881fc8029fd21fd5bc088263bf7976afdabce1fe8c1a42442eba0d728bdd8dfbb23d1f7e30c6b2172629d96402e128b50aa13b518db8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-soton-doc"

RDEPENDS:${PN} += ""

inherit rpm
