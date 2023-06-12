SUMMARY = "Documentation for texlive-fontch"
DESCRIPTION = "This package includes the documentation for texlive-fontch"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2svn17859"

RPM_NAME = "texlive-fontch-doc-2023.201.2.2svn17859-52.1.noarch.rpm"
RPM_HASH = "3a094b0e57c486624eb81947faa9b4b9395baaea7303a7ab4867ecb6a0e3fc9cdae18c9d8921b6cf404b69b1f73ae3eab36776973ba159c9bfec87490549953f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fontch-doc"
RDEPENDS:${PN} += ""

inherit rpm
