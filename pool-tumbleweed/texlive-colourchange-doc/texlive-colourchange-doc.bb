SUMMARY = "Documentation for texlive-colourchange"
DESCRIPTION = "This package includes the documentation for texlive-colourchange"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.22svn21741"

RPM_NAME = "texlive-colourchange-doc-2023.201.1.22svn21741-53.1.noarch.rpm"
RPM_HASH = "608894b9d4bd127b8047a8ee4872910082ef273acf06b285d8dff45208f4bd62edfd8058ec0e68a2d3a5950d92708984a5171b15886c93b698103586b3155417"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-colourchange-doc"

RDEPENDS:${PN} += ""

inherit rpm
