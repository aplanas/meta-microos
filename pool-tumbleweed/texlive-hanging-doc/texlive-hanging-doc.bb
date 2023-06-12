SUMMARY = "Documentation for texlive-hanging"
DESCRIPTION = "This package includes the documentation for texlive-hanging"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2bsvn15878"

RPM_NAME = "texlive-hanging-doc-2023.201.1.2bsvn15878-53.1.noarch.rpm"
RPM_HASH = "e540db4a341888ec7694fb95e5e5e4e04116e44d49347a01db6b88760625c4cf653e5383b8595cbc7f85baf40b31fe7127e515c844c867bd888b318b0879b072"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hanging-doc"
RDEPENDS:${PN} += ""

inherit rpm
