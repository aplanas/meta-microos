SUMMARY = "Documentation for texlive-tabls"
DESCRIPTION = "This package includes the documentation for texlive-tabls"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.5svn17255"

RPM_NAME = "texlive-tabls-doc-2023.209.3.5svn17255-55.1.noarch.rpm"
RPM_HASH = "4d3fb3199c499fcce3a56974582acae54c7a3298f7a1160695f20d1169cd3839787ad0ad2da017e131250b338010f0e8dc8d73107363b8b279818aa2cd924167"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tabls-doc"

RDEPENDS:${PN} += ""

inherit rpm
