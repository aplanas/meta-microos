SUMMARY = "Documentation for texlive-bosisio"
DESCRIPTION = "This package includes the documentation for texlive-bosisio"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn16989"

RPM_NAME = "texlive-bosisio-doc-2023.201.svn16989-52.1.noarch.rpm"
RPM_HASH = "a2fb92d42f412f55342fcb82a5fb8c9d1b32be6f79d624953a84396db0327d29201ead0ba42c413104767760cb0fce4c99f87eea95d3d377e6b390670b3c6e81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bosisio-doc"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
