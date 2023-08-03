SUMMARY = "Devel files for python310-PyQt6-3D"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python310-PyQt6-3D"
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python310-PyQt6-3D-devel-6.5.0-1.4.aarch64.rpm"
RPM_HASH = "e950c4d4594b13d344cc5aa3c73664e8c11079f881a6c67994f221d784e593dba41507a74483e9d65c2ff40a1dbfc9f8abf9428f34807b70d05900bc3884398f"

RPROVIDES:${PN} += "python310-PyQt6-3D-devel"

RDEPENDS:${PN} += "python310-PyQt6-devel"

inherit rpm
