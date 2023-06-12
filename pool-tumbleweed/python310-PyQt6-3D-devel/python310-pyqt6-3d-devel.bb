SUMMARY = "Devel files for python310-PyQt6-3D"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python310-PyQt6-3D"
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python310-PyQt6-3D-devel-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "a9d571dfbeec25776b39f172e966d5e1442f8a800820456e6fcd5ce0bc4be5b4cc842082c1e1f9adac3500a0c1d38472c8049b892e0ef039aa98661f60b03781"

RPROVIDES:${PN} += "python3-PyQt6-3D-devel \
python310-PyQt6-3D-devel \
python310-PyQt6-3D-devel(aarch-64)"
RDEPENDS:${PN} += "python310-PyQt6-devel"

inherit rpm
