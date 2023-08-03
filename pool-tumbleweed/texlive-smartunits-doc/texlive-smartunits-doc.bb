SUMMARY = "Documentation for texlive-smartunits"
DESCRIPTION = "This package includes the documentation for texlive-smartunits"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn39592"

RPM_NAME = "texlive-smartunits-doc-2023.209.1.2svn39592-58.1.noarch.rpm"
RPM_HASH = "3f47a17cc7c08bae04b2f745d27fe7e6031aca4776b88a7d7b674dd056d083eedaa9221d74376cd34d5d9be132ee2702a12be3a48c7ef7f00183b978a0f289c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-smartunits-doc"

RDEPENDS:${PN} += ""

inherit rpm
