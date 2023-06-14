SUMMARY = "Library to access the Windows Shell Item format"
DESCRIPTION = "Library to access the Windows Shell Item format for the libyal family of libraries. \
libyal is typically used in digital forensic tools."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230114"

RPM_NAME = "python311-libfwsi-20230114-1.4.aarch64.rpm"
RPM_HASH = "96099fc904b5e7a249eff2d5bb7361b88775d5d307aec6803cf0bfa86530376c5c04a10c63e07fd080a11b44b40fe06036c4d6b7e06ec2ab4f5e4fd524cadc26"

RPROVIDES:${PN} += "python311-libfwsi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libfguid.so.1 \
libfwsi.so.1 \
python-abi"

inherit rpm
