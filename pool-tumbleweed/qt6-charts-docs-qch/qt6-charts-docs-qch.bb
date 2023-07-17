SUMMARY = "Documentation for qt6-charts in QCH format"
DESCRIPTION = "This package contains documentation for qt6-charts in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-charts-docs-qch-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "cc8ea4af57b6f8625491d9ab84db0a595a852c4c5dbc91df219dff61a26f9aab8674fc11774201dcee5f539dc9e9ca50a8bfb3e2ef560318a570884d55883186"

RPROVIDES:${PN} += "qt6-charts-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
