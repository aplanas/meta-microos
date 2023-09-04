SUMMARY = "Documentation for texlive-zebra-goodies"
DESCRIPTION = "This package includes the documentation for texlive-zebra-goodies"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.8.0svn51554"

RPM_NAME = "texlive-zebra-goodies-doc-2023.209.0.0.8.0svn51554-53.2.noarch.rpm"
RPM_HASH = "139b4528987145c7f22000bda741d19dff77b01f3ea7ef27a69caee040492b8fad57decbafcdedc1683ab4d600a2fbed139814d6b304b05a73561e8a803fac15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zebra-goodies-doc"

RDEPENDS:${PN} += ""

inherit rpm
