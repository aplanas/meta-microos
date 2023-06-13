SUMMARY = "Documentation for texlive-gsemthesis"
DESCRIPTION = "This package includes the documentation for texlive-gsemthesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9.4svn56291"

RPM_NAME = "texlive-gsemthesis-doc-2023.201.0.0.9.4svn56291-53.1.noarch.rpm"
RPM_HASH = "9d38660d34fd15c61be3b903aa1c2b26fc47f985b07dbd92541bdddae6fcaae91bd41d7a88d2107e5f3250051479917d81ffef8414805a3ae6ad64eac6890ea3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gsemthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
