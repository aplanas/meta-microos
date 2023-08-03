SUMMARY = "Documentation for texlive-fullblck"
DESCRIPTION = "This package includes the documentation for texlive-fullblck"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.03svn25434"

RPM_NAME = "texlive-fullblck-doc-2023.209.1.03svn25434-53.1.noarch.rpm"
RPM_HASH = "559954559e6cc07976331cce204df0a4bde66f8848025573cf17ee695085943aa0bc24d3a4e6b0c23fa04d893978510c407e8b572ffed78f579353ca88b3b040"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fullblck-doc"

RDEPENDS:${PN} += ""

inherit rpm
