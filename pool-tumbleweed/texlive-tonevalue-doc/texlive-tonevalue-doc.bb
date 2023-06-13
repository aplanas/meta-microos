SUMMARY = "Documentation for texlive-tonevalue"
DESCRIPTION = "This package includes the documentation for texlive-tonevalue"
LICENSE = "Apache-1.0"

PV = "2023.201.1.0svn60058"

RPM_NAME = "texlive-tonevalue-doc-2023.201.1.0svn60058-52.1.noarch.rpm"
RPM_HASH = "7284223f3ba18593ffe999661ed93b1e819b45bec73d7fce01f55749d3f3a5c709b4e17e92e853e06349d98750cef66a985cb1ef5d643e5763d5794d2bcbaf3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tonevalue-doc"

RDEPENDS:${PN} += ""

inherit rpm
