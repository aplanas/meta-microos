SUMMARY = "Documentation and examples for QCustomPlot"
DESCRIPTION = "This package contains the documentation and examples for QCustomPlot."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.1"

RPM_NAME = "qcustomplot-doc-2.1.1-2.3.noarch.rpm"
RPM_HASH = "210999d90d40252f8b932bd076436c9f6a27df4c48bd5f4b2d53a5f1a11886a8be4ffda7f648566b4c3e472e438252bf49a6ffe0f5c5e1d09a668b075527c648"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qcustomplot-doc"
RDEPENDS:${PN} += ""

inherit rpm
