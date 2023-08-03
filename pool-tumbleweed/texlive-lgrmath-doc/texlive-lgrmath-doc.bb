SUMMARY = "Documentation for texlive-lgrmath"
DESCRIPTION = "This package includes the documentation for texlive-lgrmath"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn65038"

RPM_NAME = "texlive-lgrmath-doc-2023.209.1.0svn65038-55.1.noarch.rpm"
RPM_HASH = "e81813c63f5de64e009822a2c7d10efb89a7fb2bba345df4e30fc92bfbeadeaaf115163d3357bc2a2a64becf6b918330eb109ff1499bc33b6181f5f5216d1db7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lgrmath-doc"

RDEPENDS:${PN} += ""

inherit rpm
