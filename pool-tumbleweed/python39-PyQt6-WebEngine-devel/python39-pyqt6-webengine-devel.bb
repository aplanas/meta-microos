SUMMARY = "Devel files for python39-PyQt6-WebEngine"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python39-PyQt6-WebEngine"
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python39-PyQt6-WebEngine-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "9075380faa3bba372db237ddaa0beaef43d09f2739ad96cd6fa3c805f058b28a7fa5552f1ffaa17530dc8b5991748bf23fe3ef345fb8a2f4614dbd5216b12397"

RPROVIDES:${PN} += "python39-PyQt6-WebEngine-devel \
python39-PyQt6-WebEngine-devel(aarch-64)"

RDEPENDS:${PN} += "python39-PyQt6-devel"

inherit rpm
