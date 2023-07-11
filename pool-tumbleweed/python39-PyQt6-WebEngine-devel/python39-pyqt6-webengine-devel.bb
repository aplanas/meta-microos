SUMMARY = "Devel files for python39-PyQt6-WebEngine"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python39-PyQt6-WebEngine"
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python39-PyQt6-WebEngine-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "ed34396a54cd1365d27959fa808c798c94d3a753851fb5cbe3acce1795629cc35f8404077da66a9366b25e9f1eadade6959ea1755dc7aa15cd68d674bee0ec82"

RPROVIDES:${PN} += "python39-PyQt6-WebEngine-devel"

RDEPENDS:${PN} += "python39-PyQt6-devel"

inherit rpm
