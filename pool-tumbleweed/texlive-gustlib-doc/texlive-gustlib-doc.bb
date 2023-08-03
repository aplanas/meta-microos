SUMMARY = "Documentation for texlive-gustlib"
DESCRIPTION = "This package includes the documentation for texlive-gustlib"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn54074"

RPM_NAME = "texlive-gustlib-doc-2023.209.svn54074-54.1.noarch.rpm"
RPM_HASH = "b9d362b16c8fbd94e2d7aa528f878b7b13a154c73f4b04327296d9eb80e98199d9df7319ae2b358d3cf50d972a744141239c35821940382bde4d8a6d043d6920"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gustlib-doc"

RDEPENDS:${PN} += ""

inherit rpm
