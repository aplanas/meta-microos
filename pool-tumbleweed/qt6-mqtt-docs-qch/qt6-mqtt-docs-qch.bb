SUMMARY = "Documentation for qt6-mqtt in QCH format"
DESCRIPTION = "This package contains documentation for qt6-mqtt in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-mqtt-docs-qch-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "f1fc93f19873d95a610285721e95246e3091afe4f4d48bc53937ccced5eaf5b0337338de12f9a79fbe86a7c906ca53d239c9994411d83cb50fea8f4bb333b1c5"

RPROVIDES:${PN} += "qt6-mqtt-docs-qch \
qt6-mqtt-docs-qch(aarch-64)"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
