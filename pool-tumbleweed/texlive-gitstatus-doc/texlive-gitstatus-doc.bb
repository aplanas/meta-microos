SUMMARY = "Documentation for texlive-gitstatus"
DESCRIPTION = "This package includes the documentation for texlive-gitstatus"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn64662"

RPM_NAME = "texlive-gitstatus-doc-2023.209.1.1svn64662-54.2.noarch.rpm"
RPM_HASH = "13dc620bf407ddd9b4506fb11ce9319015684fa28c320ac7c0dd1f6a548bb6cf3518f38e77f5e21c637c7c62affeebc20d5ed27a0fccf280bd4bb27063024443"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gitstatus-doc"

RDEPENDS:${PN} += ""

inherit rpm
