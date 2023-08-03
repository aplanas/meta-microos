SUMMARY = "Documentation for texlive-tabto-ltx"
DESCRIPTION = "This package includes the documentation for texlive-tabto-ltx"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn54080"

RPM_NAME = "texlive-tabto-ltx-doc-2023.209.1.4svn54080-55.1.noarch.rpm"
RPM_HASH = "19b558c02c3eec0edf2d01f7fa22ed9a10f8d2a66551efedb49cd1f42eb64f983e4f09576c2c605a3873ac8efa0ee5b01af31f676192fa595aec1b4d23077e48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tabto-ltx-doc"

RDEPENDS:${PN} += ""

inherit rpm
