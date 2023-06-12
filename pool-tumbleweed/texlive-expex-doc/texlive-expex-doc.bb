SUMMARY = "Documentation for texlive-expex"
DESCRIPTION = "This package includes the documentation for texlive-expex"
LICENSE = "LPPL-1.0"

PV = "2023.201.5.1bsvn44499"

RPM_NAME = "texlive-expex-doc-2023.201.5.1bsvn44499-52.1.noarch.rpm"
RPM_HASH = "05f4e5f8686b6f54c185f3e202529fc35445d390933184e58afb3a6f2625a2469862e9455f25ef8b45a83370bc8309cfe4ed43c959950bb93fd75235ed239d93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-expex-doc"
RDEPENDS:${PN} += ""

inherit rpm
