SUMMARY = "Documentation for texlive-karnaughmap"
DESCRIPTION = "This package includes the documentation for texlive-karnaughmap"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn36989"

RPM_NAME = "texlive-karnaughmap-doc-2023.209.2.0svn36989-56.1.noarch.rpm"
RPM_HASH = "ff50327f31a4f212d01694ba3176cad4ab93d4546d96120b1d01e852d7fa90d924087f83dcd2c5771c50ef29a00ffbee63b732e631ebc7dfd23fab51c118a1a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-karnaughmap-doc"

RDEPENDS:${PN} += ""

inherit rpm
