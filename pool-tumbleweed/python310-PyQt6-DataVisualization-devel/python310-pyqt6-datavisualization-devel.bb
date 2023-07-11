SUMMARY = "Devel files for python310-PyQt6-DataVisualization"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python310-PyQt6-DataVisualization"
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python310-PyQt6-DataVisualization-devel-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "6e68d4d1780ef089d3b32783147860e13835fbb706b41eef873656f8d15dcdfef4e7380f14f2df8bea82562c8597fa9f4d3c578ca5b1d0b10705381e52cba09f"

RPROVIDES:${PN} += "python310-PyQt6-DataVisualization-devel"

RDEPENDS:${PN} += "python-abi \
python310-PyQt6-devel"

inherit rpm
