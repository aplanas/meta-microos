SUMMARY = "Documentation for texlive-pdfextra"
DESCRIPTION = "This package includes the documentation for texlive-pdfextra"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn65184"

RPM_NAME = "texlive-pdfextra-doc-2023.201.0.0.3svn65184-51.1.noarch.rpm"
RPM_HASH = "2701e0ba1e7c9ea99a2e045da7e4cb662ac941922712bcfbc13d6a3c0965a66628bfb223d046c56e3b5e3e67cd721e3bbaca8badb3af200c818f9b2567c71250"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfextra-doc"

RDEPENDS:${PN} += ""

inherit rpm
