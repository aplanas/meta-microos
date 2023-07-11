SUMMARY = "Algorithmic Differentiation Library for C/C++ -- documentation"
DESCRIPTION = "This package provides the user's manual for ADOL-C."
LICENSE = "EPL-1.0 | GPL-2.0-or-later"

PV = "2.7.2"

RPM_NAME = "adolc-doc-2.7.2-2.4.noarch.rpm"
RPM_HASH = "4dc1bcebee523e65e1aded70da76144664df7b90a912f64dc587dd922b8d592ac5b3d7a62fa6d0a776e797ac729e992cf9a201ac11c7b6912f293a692b1b5230"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adolc-doc"

RDEPENDS:${PN} += ""

inherit rpm
