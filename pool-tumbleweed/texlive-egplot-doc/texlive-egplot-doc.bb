SUMMARY = "Documentation for texlive-egplot"
DESCRIPTION = "This package includes the documentation for texlive-egplot"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.02asvn20617"

RPM_NAME = "texlive-egplot-doc-2023.209.1.02asvn20617-54.2.noarch.rpm"
RPM_HASH = "e8731c3cf769d1745e53e65eb9d6d3d9c78dc19d405fd0e21c73538c84460288e4a1d6bf37da819b09e1db88a7b776673f02b4bbc59293f864b6337848d87c83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-egplot-doc"

RDEPENDS:${PN} += ""

inherit rpm
