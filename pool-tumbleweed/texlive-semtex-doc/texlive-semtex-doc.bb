SUMMARY = "Documentation for texlive-semtex"
DESCRIPTION = "This package includes the documentation for texlive-semtex"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.45svn56530"

RPM_NAME = "texlive-semtex-doc-2023.201.0.0.45svn56530-53.1.noarch.rpm"
RPM_HASH = "9881ae9354eab76695291e19b8c04ebba6160b36a4b3db16b5562e00599253ba96165414e346fb255f1f371fad3c768ba9be1f1f76d4c7236ba000c8e532d015"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-semtex-doc"

RDEPENDS:${PN} += ""

inherit rpm
