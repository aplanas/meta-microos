SUMMARY = "Documentation for texlive-umthesis"
DESCRIPTION = "This package includes the documentation for texlive-umthesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn15878"

RPM_NAME = "texlive-umthesis-doc-2023.209.0.0.2svn15878-54.1.noarch.rpm"
RPM_HASH = "37248146618244c148d690372f53429ab0f6fa244940155703454160156adff2b5ba7b7ea0bedb4fc475765eebae11d64e2cf2d19859f16eb5a0bff369e8980c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-umthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
