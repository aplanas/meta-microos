SUMMARY = "Documentation for texlive-emisa"
DESCRIPTION = "This package includes the documentation for texlive-emisa"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3.0svn60068"

RPM_NAME = "texlive-emisa-doc-2023.209.2.3.0svn60068-54.2.noarch.rpm"
RPM_HASH = "5ea084b75d8269113507235eef93d904428823ceac74b6167ef16f5c88ef40a219aa5fec96ac34aa30e5e6cd3714be21293ecb40e79ef2163d9df14e4eb46e0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-emisa-doc"

RDEPENDS:${PN} += ""

inherit rpm
