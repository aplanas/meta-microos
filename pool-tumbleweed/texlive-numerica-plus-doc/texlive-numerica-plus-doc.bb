SUMMARY = "Documentation for texlive-numerica-plus"
DESCRIPTION = "This package includes the documentation for texlive-numerica-plus"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0.0svn61289"

RPM_NAME = "texlive-numerica-plus-doc-2023.209.2.0.0svn61289-55.1.noarch.rpm"
RPM_HASH = "d9ac35a82be4de000140e7417c43e8b1f4eeb5d449c819fe18ae685fbb84061945c9d8cf4d3dd38eda33f2cbc9b5759c3a680f218b3616e4b66f9c7ac43bd0f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-numerica-plus-doc"

RDEPENDS:${PN} += ""

inherit rpm
