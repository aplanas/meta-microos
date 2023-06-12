SUMMARY = "Library for MacOS data types"
DESCRIPTION = "libfmos is a library for MacOS data types."
LICENSE = "LGPL-3.0-or-later"

PV = "20220811"

RPM_NAME = "python311-libfmos-20220811-2.4.aarch64.rpm"
RPM_HASH = "ede1cf8a345f96b02f770e2b5166e39939fa0c99ba6e8d4f634f02ec2eab79d9d281871a75d4681d495336b508cf529ec83430e9065fe3f1354f0069bf79ec75"

RPROVIDES:${PN} += "python311-libfmos \
python311-libfmos(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libfmos.so.1()(64bit) \
libfmos.so.1(V_20220811)(64bit) \
python(abi)"

inherit rpm
