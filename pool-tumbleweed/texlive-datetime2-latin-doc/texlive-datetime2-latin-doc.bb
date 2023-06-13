SUMMARY = "Documentation for texlive-datetime2-latin"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-latin"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn47748"

RPM_NAME = "texlive-datetime2-latin-doc-2023.201.1.0svn47748-52.1.noarch.rpm"
RPM_HASH = "89a8dc1ba6cbac184a016d596def56133a8ef1e0f4cc4968ec35e9f08b4783c4b1734ae034637b1684bbb7cd6c58ed5772c66141fa236b006c77ea773f895087"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-latin-doc"

RDEPENDS:${PN} += ""

inherit rpm
