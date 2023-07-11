SUMMARY = "Devel files for python311-PyQt6-3D"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python311-PyQt6-3D"
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python311-PyQt6-3D-devel-6.5.0-1.3.aarch64.rpm"
RPM_HASH = "bfc045fc77d82a630283cdbae07a2fd9aaf0b61c41efcdad974c2b7cf017324e56e99a2288f6ad9c1b34855fd2fa0ed571f9d769ef9f4a15b8e686e9d1712027"

RPROVIDES:${PN} += "python3-PyQt6-3D-devel \
python311-PyQt6-3D-devel"

RDEPENDS:${PN} += "python311-PyQt6-devel"

inherit rpm
