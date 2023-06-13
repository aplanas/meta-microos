SUMMARY = "Devel files for python39-PyQt6-DataVisualization"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python39-PyQt6-DataVisualization"
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python39-PyQt6-DataVisualization-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "f737549bacad06953f1c42c03d008958254a31820db558c5486ffc11739afa0788f1f51de56ca6cd9e2d16d53b3152457158a70216218df3419101c029128e52"

RPROVIDES:${PN} += "python39-PyQt6-DataVisualization-devel \
python39-PyQt6-DataVisualization-devel(aarch-64)"

RDEPENDS:${PN} += "python(abi) \
python39-PyQt6-devel"

inherit rpm
