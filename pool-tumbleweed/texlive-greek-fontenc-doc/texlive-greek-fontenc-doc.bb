SUMMARY = "Documentation for texlive-greek-fontenc"
DESCRIPTION = "This package includes the documentation for texlive-greek-fontenc"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2.1svn66513"

RPM_NAME = "texlive-greek-fontenc-doc-2023.201.2.2.1svn66513-53.2.noarch.rpm"
RPM_HASH = "9ad31fe7c752c7d633162a0014d3a71767ad3b6c5116be11616426ef06280f8381fbe070baa89eb003bd9b523ee7fb4dfe5cb670d9e0891738a2fec51ac9e38b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-greek-fontenc-doc"

RDEPENDS:${PN} += ""

inherit rpm
