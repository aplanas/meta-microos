SUMMARY = "Documentation for texlive-tlc-article"
DESCRIPTION = "This package includes the documentation for texlive-tlc-article"
LICENSE = "BSD-3-Clause"

PV = "2023.201.1.0.17svn51431"

RPM_NAME = "texlive-tlc-article-doc-2023.201.1.0.17svn51431-52.1.noarch.rpm"
RPM_HASH = "ce78d84c7b651c87219ba9e326d51b28bdedb63e76c27ac4c01ce21c799af1388a5d773f1027fc3ecb47050b3346b6356fa4f01f9b880078693a184cfa524f22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tlc-article-doc"

RDEPENDS:${PN} += "/bin/bash"

inherit rpm
