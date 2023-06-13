SUMMARY = "Documentation for texlive-coseoul"
DESCRIPTION = "This package includes the documentation for texlive-coseoul"
LICENSE = "LPPL-1.0"

PV = "2023.204.1.1svn23862"

RPM_NAME = "texlive-coseoul-doc-2023.204.1.1svn23862-54.1.noarch.rpm"
RPM_HASH = "ed0efbb88875dd09eb9f3b66704aaad45a135173ab79f19353941def2ee36f4b671a1f2c70534bf7be15b6788d0841bae93455024c30ab90db09328a9b39236a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-coseoul-doc"

RDEPENDS:${PN} += ""

inherit rpm
