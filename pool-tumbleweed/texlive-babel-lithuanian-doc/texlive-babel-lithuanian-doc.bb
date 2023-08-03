SUMMARY = "Documentation for texlive-babel-lithuanian"
DESCRIPTION = "This package includes the documentation for texlive-babel-lithuanian"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn66513"

RPM_NAME = "texlive-babel-lithuanian-doc-2023.209.1.0svn66513-54.1.noarch.rpm"
RPM_HASH = "d00dcad120574540dda165090ed947ba90c29392e2239064fc86ffdf129928e38463148ad43e8aa2493e09edfb7431971b7eb37bc661f9b3474c0276645ddda4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-lithuanian-doc"

RDEPENDS:${PN} += ""

inherit rpm
