SUMMARY = "Documentation for texlive-eukdate"
DESCRIPTION = "This package includes the documentation for texlive-eukdate"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.04svn15878"

RPM_NAME = "texlive-eukdate-doc-2023.201.1.04svn15878-52.1.noarch.rpm"
RPM_HASH = "b9bbb0083bddb81b9d3fb77c146b5c49c3ce8213df45e51f145e3c9d28438699d8c3a1641f700225328104281eb66e866963e92949d21ce5b87273b847c859bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eukdate-doc"
RDEPENDS:${PN} += ""

inherit rpm
