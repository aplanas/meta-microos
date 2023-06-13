SUMMARY = "Documentation for texlive-textualicomma"
DESCRIPTION = "This package includes the documentation for texlive-textualicomma"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn48474"

RPM_NAME = "texlive-textualicomma-doc-2023.201.1.1svn48474-54.1.noarch.rpm"
RPM_HASH = "198fa427630bf2b87ec06aafe26dac388d145ed7e5624f13192a115724e5ee33cf14126850278c85c4ebd05982406b1144fab1dc47970c83769d8b9c85a9de66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-textualicomma-doc"

RDEPENDS:${PN} += ""

inherit rpm
