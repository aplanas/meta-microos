SUMMARY = "Documentation for texlive-pdfx"
DESCRIPTION = "This package includes the documentation for texlive-pdfx"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6.3svn50338"

RPM_NAME = "texlive-pdfx-doc-2023.201.1.6.3svn50338-51.1.noarch.rpm"
RPM_HASH = "5cf02410abb9ffed65b6b1067114d65b9cc0f82538576ed164e33c09918d2f3bb6cfa37aeeba78128cf2e14d3b49160b2a75987e812d53a3229d0b8f1770d8fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfx-doc"

RDEPENDS:${PN} += ""

inherit rpm
