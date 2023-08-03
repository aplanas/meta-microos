SUMMARY = "Documentation for texlive-kurier"
DESCRIPTION = "This package includes the documentation for texlive-kurier"
LICENSE = "LPPL-1.3c"

PV = "2023.209.0.0.995bsvn19612"

RPM_NAME = "texlive-kurier-doc-2023.209.0.0.995bsvn19612-56.1.noarch.rpm"
RPM_HASH = "84be3eb2df34944c83630f1ca8dc08e919738d961c27a9a6f2062f0091474582d48317396ab1486f137f3d5319974c60fdffe321c559e5b57ae401915122c846"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-kurier-doc-en;pl \
texlive-kurier-doc"

RDEPENDS:${PN} += ""

inherit rpm
