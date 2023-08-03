SUMMARY = "Devel files for python311-PyQt6-3D"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python311-PyQt6-3D"
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python311-PyQt6-3D-devel-6.5.0-1.4.aarch64.rpm"
RPM_HASH = "82484d7033c9437a28ba27577ef72be08f5c523c672893dfd3cbd05f62d4739b8dde92b79f6ea5847a3e0c9f5cc27a70632680cdec7098e7b1363f2e30bacc34"

RPROVIDES:${PN} += "python3-PyQt6-3D-devel \
python311-PyQt6-3D-devel"

RDEPENDS:${PN} += "python311-PyQt6-devel"

inherit rpm
