SUMMARY = "Documentation for texlive-etbb"
DESCRIPTION = "This package includes the documentation for texlive-etbb"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.056svn61872"

RPM_NAME = "texlive-etbb-doc-2023.209.1.056svn61872-53.1.noarch.rpm"
RPM_HASH = "9921767c808d8e33b2b6fb46440b339d3931df4e9d995348d5a413cd505e6d55cecf0b6e24e951000e799aecbd03014ae404974ab7d7efa07b53d5001e32a2ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-etbb-doc"

RDEPENDS:${PN} += ""

inherit rpm
