SUMMARY = "Library to access the Windows Shell Item format"
DESCRIPTION = "Library to access the Windows Shell Item format for the libyal family of libraries. \
libyal is typically used in digital forensic tools."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230710"

RPM_NAME = "python310-libfwsi-20230710-2.1.aarch64.rpm"
RPM_HASH = "a06d017f2f777c01afac4a55e5506011094a6fa97f3cfb7e7cea55b3fdb2f235772de6db4de470e063a128d58fbe219e222e90342eebab820c4c84f061e83b33"

RPROVIDES:${PN} += "python310-libfwsi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libfguid.so.1 \
libfwsi.so.1 \
libuna.so.1 \
python-abi"

inherit rpm
