SUMMARY = "Devel files for python310-PyQt6-3D"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python310-PyQt6-3D"
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python310-PyQt6-3D-devel-6.5.0-1.3.aarch64.rpm"
RPM_HASH = "59076042bee352ac8bdf0055f8c1e482afc6ac3d0cc60b06c974fed1b77cd4a5a11d1c63dee088c129eb220b87fb2625f31a06f3a9c953c1673d6ddc48bc7752"

RPROVIDES:${PN} += "python310-PyQt6-3D-devel"

RDEPENDS:${PN} += "python310-PyQt6-devel"

inherit rpm
