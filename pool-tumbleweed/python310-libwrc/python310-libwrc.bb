SUMMARY = "Library to support the Windows Resource Compiler format"
DESCRIPTION = "libwrc is a library to support the Windows Resource Compiler format."
LICENSE = "LGPL-3.0-or-later"

PV = "20230318"

RPM_NAME = "python310-libwrc-20230318-1.2.aarch64.rpm"
RPM_HASH = "a7297c70840b649ca315b4d324181a29cc5d5b2b350c569ea4b269c635f3ef7318c35baf7157174aa4b8318b10a88cf30d298747cda7997c33e043084a89975b"

RPROVIDES:${PN} += "python3-libwrc \
python310-libwrc \
python310-libwrc(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libclocale.so.1()(64bit) \
libclocale.so.1(V_20221218)(64bit) \
libwrc.so.1()(64bit) \
libwrc.so.1(V_20230318)(64bit) \
python(abi)"

inherit rpm
