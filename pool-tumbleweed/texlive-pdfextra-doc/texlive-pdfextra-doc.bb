SUMMARY = "Documentation for texlive-pdfextra"
DESCRIPTION = "This package includes the documentation for texlive-pdfextra"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn65184"

RPM_NAME = "texlive-pdfextra-doc-2023.209.0.0.3svn65184-52.1.noarch.rpm"
RPM_HASH = "1a38cceffdd8869909de0a85d7d59d35aded1b89b153ced5623d62d9aee37355bc14f28ba88cfac4e93af3f86eb64c9d26e61e0bf44404b2da87305ef0fbae14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfextra-doc"

RDEPENDS:${PN} += ""

inherit rpm
