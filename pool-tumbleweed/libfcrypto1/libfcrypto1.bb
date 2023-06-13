SUMMARY = "Library for encryption formats"
DESCRIPTION = "libfcrypto is a library for encryption formats. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20221229"

RPM_NAME = "libfcrypto1-20221229-1.2.aarch64.rpm"
RPM_HASH = "dceb89999ee6339b491d57f0ce5ae199ec72c2a7b636aefeb9c46c435f3017824e2c38a64a4ac27abdbd2347e8bf6b4b2e8348359caab23de0227cef55078f98"

RPROVIDES:${PN} += "libfcrypto.so.1()(64bit) \
libfcrypto.so.1(V_20221229)(64bit) \
libfcrypto1 \
libfcrypto1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit)"

inherit rpm
