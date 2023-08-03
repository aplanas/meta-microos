SUMMARY = "Documentation for texlive-adjustbox"
DESCRIPTION = "This package includes the documentation for texlive-adjustbox"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3asvn64967"

RPM_NAME = "texlive-adjustbox-doc-2023.209.1.3asvn64967-55.1.noarch.rpm"
RPM_HASH = "23a9cc71f76cb4c5784be02d806f38927122b44d75d94cec3392a9215d04f537e4a4fe970ce275b0b7596eb157a42d3bd02ee8a1931ccf66ac9f5909e3a96eeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-adjustbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
