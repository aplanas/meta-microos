SUMMARY = "Documentation for texlive-topiclongtable"
DESCRIPTION = "This package includes the documentation for texlive-topiclongtable"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3.2svn54758"

RPM_NAME = "texlive-topiclongtable-doc-2023.201.1.3.2svn54758-52.1.noarch.rpm"
RPM_HASH = "1c609b268bf8690d5ecf1ddb57294d3af635231ac46943e7265698b3fbf05cabcec893ba574511e1ae0cab4b50402d32c0c3dd46ee79c89a36e23e087c6b7c0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-topiclongtable-doc"

RDEPENDS:${PN} += ""

inherit rpm
