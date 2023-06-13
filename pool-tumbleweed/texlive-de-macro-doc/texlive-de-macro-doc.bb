SUMMARY = "Documentation for texlive-de-macro"
DESCRIPTION = "This package includes the documentation for texlive-de-macro"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4.1svn61719"

RPM_NAME = "texlive-de-macro-doc-2023.201.1.4.1svn61719-52.1.noarch.rpm"
RPM_HASH = "1c860f8947deb13eba2390d4407013d15d4115cf1d2821b2c66fb1e14f525221723af9d71b253c4e889a88dec3c40a71d991a2d06f926989f73c286395981dfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-de-macro-doc"

RDEPENDS:${PN} += ""

inherit rpm
