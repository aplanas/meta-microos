SUMMARY = "Devel files for python39-PyQt6-DataVisualization"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python39-PyQt6-DataVisualization"
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python39-PyQt6-DataVisualization-devel-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "9ec2e2657b17e4e0aab6b739ac5ee4e70e5cbeeb948b9fdf8ac9895dc87034c1150431d813a1024a8a8dbb543dcefb1f1be857a858e11aed29ca7fa93937a147"

RPROVIDES:${PN} += "python39-PyQt6-DataVisualization-devel"

RDEPENDS:${PN} += "python-abi \
python39-PyQt6-devel"

inherit rpm
