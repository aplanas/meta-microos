SUMMARY = "Documentation for texlive-minim-mp"
DESCRIPTION = "This package includes the documentation for texlive-minim-mp"
LICENSE = "LPPL-1.0"

PV = "2023.209.2023_1.2svn66395"

RPM_NAME = "texlive-minim-mp-doc-2023.209.2023_1.2svn66395-55.1.noarch.rpm"
RPM_HASH = "14e42a982ba83be92a7922999ec0d673e9d0cba40ac89df0755b3b18c39e1ec30c6486345f1734fd7253d27206c8fd07827f1bbf7dcb2e0cbb55fe5cda5b7cec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-minim-mp-doc"

RDEPENDS:${PN} += ""

inherit rpm
