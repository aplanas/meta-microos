SUMMARY = "Documentation for texlive-makebarcode"
DESCRIPTION = "This package includes the documentation for texlive-makebarcode"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.0svn15878"

RPM_NAME = "texlive-makebarcode-doc-2023.208.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "b77e742a6b2f4ec5491b9a48d75106fbc0086963eacf99c6afa6970de9ab672f7815941706be9f549a5894beca287821b72dcd13a98eed1cd068251724b1c7ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-makebarcode-doc"

RDEPENDS:${PN} += ""

inherit rpm
