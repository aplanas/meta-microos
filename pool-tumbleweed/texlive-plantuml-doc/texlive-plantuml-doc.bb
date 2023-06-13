SUMMARY = "Documentation for texlive-plantuml"
DESCRIPTION = "This package includes the documentation for texlive-plantuml"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3.1svn55214"

RPM_NAME = "texlive-plantuml-doc-2023.201.0.0.3.1svn55214-51.1.noarch.rpm"
RPM_HASH = "d129985e2688c7bc98dfffd8a879b940b2fb9cc52d56c72815563ea2a32906e1c5c6f68d3545db549698cbb2cc187595d6c49af2daa58b98204a69216d778335"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-plantuml-doc"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
