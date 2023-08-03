SUMMARY = "Documentation for texlive-libertinegc"
DESCRIPTION = "This package includes the documentation for texlive-libertinegc"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.01svn44616"

RPM_NAME = "texlive-libertinegc-doc-2023.209.1.01svn44616-55.1.noarch.rpm"
RPM_HASH = "461ecc4739ff8226a6e1f00a502238ed58d6091fc83c78e741563ae370c4a7e59d028233014f73f1380ebf5cb2c3abfa75c57d3bc42968e3d8d2250b184e7be2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-libertinegc-doc"

RDEPENDS:${PN} += ""

inherit rpm
