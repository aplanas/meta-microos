SUMMARY = "Documentation for texlive-intopdf"
DESCRIPTION = "This package includes the documentation for texlive-intopdf"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.4.1svn63987"

RPM_NAME = "texlive-intopdf-doc-2023.208.0.0.4.1svn63987-53.1.noarch.rpm"
RPM_HASH = "2da197d1fb37a9ff200c2969c18df35317000d27d072f3724d6647950664b58b9c0b726458ca692d89e3196f5453f0156d85ef944787bd1831f89c5ac1fa3cf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-intopdf-doc"

RDEPENDS:${PN} += ""

inherit rpm
