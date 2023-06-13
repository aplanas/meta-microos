SUMMARY = "Documentation for texlive-fnumprint"
DESCRIPTION = "This package includes the documentation for texlive-fnumprint"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1asvn29173"

RPM_NAME = "texlive-fnumprint-doc-2023.201.1.1asvn29173-52.1.noarch.rpm"
RPM_HASH = "8b477ecf5d7f62c7054386cd38b45d8428f9b6521bc1d3d54ce9c6c4964d9ca9bac861fcf6346815005e3d1d63455b71a92c9622a793856fe6c49eafe450436b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fnumprint-doc"

RDEPENDS:${PN} += ""

inherit rpm
