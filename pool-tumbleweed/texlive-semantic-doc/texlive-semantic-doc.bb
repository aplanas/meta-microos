SUMMARY = "Documentation for texlive-semantic"
DESCRIPTION = "This package includes the documentation for texlive-semantic"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn15878"

RPM_NAME = "texlive-semantic-doc-2023.201.2.0svn15878-53.1.noarch.rpm"
RPM_HASH = "071fff431fa05437fa82e7e4825ccd6d10e9972da8aecbb31710b83f9978a648f0844c5438f36fbc58ed92cff1d917b44e0c68acbd5c2ea380980d67aa894d32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-semantic-doc"

RDEPENDS:${PN} += ""

inherit rpm
