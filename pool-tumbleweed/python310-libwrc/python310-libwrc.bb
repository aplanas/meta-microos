SUMMARY = "Library to support the Windows Resource Compiler format"
DESCRIPTION = "libwrc is a library to support the Windows Resource Compiler format."
LICENSE = "LGPL-3.0-or-later"

PV = "20230318"

RPM_NAME = "python310-libwrc-20230318-1.2.aarch64.rpm"
RPM_HASH = "a7297c70840b649ca315b4d324181a29cc5d5b2b350c569ea4b269c635f3ef7318c35baf7157174aa4b8318b10a88cf30d298747cda7997c33e043084a89975b"

RPROVIDES:${PN} += "python3-libwrc \
python310-libwrc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libwrc.so.1 \
python-abi"

inherit rpm
