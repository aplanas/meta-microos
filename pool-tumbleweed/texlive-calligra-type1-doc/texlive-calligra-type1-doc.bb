SUMMARY = "Documentation for texlive-calligra-type1"
DESCRIPTION = "This package includes the documentation for texlive-calligra-type1"
LICENSE = "LPPL-1.0"

PV = "2023.209.001.000svn24302"

RPM_NAME = "texlive-calligra-type1-doc-2023.209.001.000svn24302-53.1.noarch.rpm"
RPM_HASH = "2c0b048f4b844dd589957dd2d25fe143b390260723e2781505157a96f6992db6dd611c152cd5dd8030dce2d8c02e0e039b79685f1d32dfbdbd2295b7509fe767"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-calligra-type1-doc"

RDEPENDS:${PN} += ""

inherit rpm
