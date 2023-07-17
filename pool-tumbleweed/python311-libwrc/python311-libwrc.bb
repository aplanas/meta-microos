SUMMARY = "Library to support the Windows Resource Compiler format"
DESCRIPTION = "libwrc is a library to support the Windows Resource Compiler format."
LICENSE = "LGPL-3.0-or-later"

PV = "20230318"

RPM_NAME = "python311-libwrc-20230318-1.5.aarch64.rpm"
RPM_HASH = "06ad782152e9fac00e93f7cdda9db503ab07af498e86fee88cdc8a29a115486e993ec6e1c420e0bd17c152ba03c7556097a43af1660008790ec3316aaf7d1f32"

RPROVIDES:${PN} += "python3-libwrc \
python311-libwrc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libwrc.so.1 \
python-abi"

inherit rpm
