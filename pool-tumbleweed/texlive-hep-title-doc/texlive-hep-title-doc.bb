SUMMARY = "Documentation for texlive-hep-title"
DESCRIPTION = "This package includes the documentation for texlive-hep-title"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn64907"

RPM_NAME = "texlive-hep-title-doc-2023.201.1.1svn64907-53.2.noarch.rpm"
RPM_HASH = "7a54a154ae30de2b3577f79f25b07b8f08a0ceb0a6d709dd7b1dd114c185ef0a9b534277d7587dda817cc0863b9768a1bfc900c10f22f4d0ae397082c7d55b2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-title-doc"

RDEPENDS:${PN} += ""

inherit rpm
