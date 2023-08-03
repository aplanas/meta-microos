SUMMARY = "Documentation for texlive-crosswrd"
DESCRIPTION = "This package includes the documentation for texlive-crosswrd"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.0svn16896"

RPM_NAME = "texlive-crosswrd-doc-2023.209.3.0svn16896-55.1.noarch.rpm"
RPM_HASH = "6492f106c9a3b986c81e90e2b090006af667c8ba70f86dcfd8b080331407c1b5a25561f747ed68399daad63419a3795fa5abfad6c9c9ad22ed95f5eac6d8bc14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-crosswrd-doc"

RDEPENDS:${PN} += ""

inherit rpm
