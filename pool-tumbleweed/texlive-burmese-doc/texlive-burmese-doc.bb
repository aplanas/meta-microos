SUMMARY = "Documentation for texlive-burmese"
DESCRIPTION = "This package includes the documentation for texlive-burmese"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn25185"

RPM_NAME = "texlive-burmese-doc-2023.201.svn25185-52.1.noarch.rpm"
RPM_HASH = "f2761dacac74e668e6558de9fec12a542720d6b32c041c66c040e1a75aa8f958314eb9595d3ea88bf540e1d0827b110fc796fe825076871c044c631a05b57534"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-burmese-doc"

RDEPENDS:${PN} += ""

inherit rpm
