SUMMARY = "Documentation for texlive-metanorma"
DESCRIPTION = "This package includes the documentation for texlive-metanorma"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5.0svn55010"

RPM_NAME = "texlive-metanorma-doc-2023.209.0.0.5.0svn55010-55.1.noarch.rpm"
RPM_HASH = "ed07bbaf92320cce733bff73f7dd5ac026e03b85ff77b3f372f467dc7d904011f74dbf9c77f1272a37fbbf6a4b5e2ebda5f7cd9e8093221bfeadb7fa6bff5daa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metanorma-doc"

RDEPENDS:${PN} += ""

inherit rpm
