SUMMARY = "Devel files for python310-PyQt6-DataVisualization"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python310-PyQt6-DataVisualization"
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python310-PyQt6-DataVisualization-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "3660fa6728e87926f775fbf1aeb422c717ffe85a8753e5cb55d514effecb6c4209a31375ddd7d0577ea8263f2bb2d0479ed51c64ec3f07e8580e49c84b873fe8"

RPROVIDES:${PN} += "python3-PyQt6-DataVisualization-devel \
python310-PyQt6-DataVisualization-devel"

RDEPENDS:${PN} += "python-abi \
python310-PyQt6-devel"

inherit rpm
