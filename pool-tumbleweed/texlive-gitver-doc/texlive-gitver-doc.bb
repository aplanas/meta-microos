SUMMARY = "Documentation for texlive-gitver"
DESCRIPTION = "This package includes the documentation for texlive-gitver"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn63920"

RPM_NAME = "texlive-gitver-doc-2023.201.1.4svn63920-53.1.noarch.rpm"
RPM_HASH = "18ac6d76d0cdef207a7ceb0bad7a74d2b7caa1c86e2c977ecd7a2e2c1475c8abd122b74ed0a17f6ff2b18b23e28efe21b4ba58598a4123499707a98c6249a693"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gitver-doc"

RDEPENDS:${PN} += ""

inherit rpm
