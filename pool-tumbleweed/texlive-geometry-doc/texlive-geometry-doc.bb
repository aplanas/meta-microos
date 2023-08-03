SUMMARY = "Documentation for texlive-geometry"
DESCRIPTION = "This package includes the documentation for texlive-geometry"
LICENSE = "LPPL-1.0"

PV = "2023.209.5.9svn61719"

RPM_NAME = "texlive-geometry-doc-2023.209.5.9svn61719-53.1.noarch.rpm"
RPM_HASH = "6dbfa6bf785214da75f71eb0aa41a781369a6784feef2265d0f2ac658fa0ed41098432d2b233a9be92f6f9b7a413d704e25d5325031b73cc870c58f84022cb8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-geometry-doc-de;en \
texlive-geometry-doc"

RDEPENDS:${PN} += ""

inherit rpm
