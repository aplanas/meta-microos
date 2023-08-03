SUMMARY = "Documentation for texlive-fvextra"
DESCRIPTION = "This package includes the documentation for texlive-fvextra"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn65158"

RPM_NAME = "texlive-fvextra-doc-2023.209.1.5svn65158-53.1.noarch.rpm"
RPM_HASH = "63c065164f2a440bf9472b9cfa48b6c1064569e2f4fa78fec4412b9cd0b60d3698a8d277e08b11482ae9e77d177a3360ce5e968ea3326a3bd7687ac3fcc159d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fvextra-doc"

RDEPENDS:${PN} += ""

inherit rpm
