SUMMARY = "Documentation for texlive-graphics-def"
DESCRIPTION = "This package includes the documentation for texlive-graphics-def"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn64487"

RPM_NAME = "texlive-graphics-def-doc-2023.201.svn64487-53.2.noarch.rpm"
RPM_HASH = "38014e43e6a4f4a05c6c6fcf7456fc78b8178bd881d9a9ed035ac3956c59971b6efd1b11d32f627404fab9f0f4a4f59653a7846e3750b1c1ae606796a8e1722a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphics-def-doc"

RDEPENDS:${PN} += ""

inherit rpm
