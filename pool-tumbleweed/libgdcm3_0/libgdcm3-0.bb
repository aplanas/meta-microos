SUMMARY = "DICOM medical file parser library"
DESCRIPTION = "This package contains the shared library required by applications that \
are using gdcm for DICOM processing."
LICENSE = "BSD-3-Clause"

PV = "3.0.21"

RPM_NAME = "libgdcm3_0-3.0.21-1.5.aarch64.rpm"
RPM_HASH = "65a62dabe1dc1d08ae23c0f0e5f43f5b72217b22d1e5c1ea90e11d232d2c45683ed3380787c5cff897919a05dcb4060cc07483397dbd885d74eb497e75b31c86"

RPROVIDES:${PN} += "libgdcm3_0 \
libgdcm3_0(aarch-64) \
libgdcmCommon.so.3.0()(64bit) \
libgdcmDICT.so.3.0()(64bit) \
libgdcmDSED.so.3.0()(64bit) \
libgdcmIOD.so.3.0()(64bit) \
libgdcmMEXD.so.3.0()(64bit) \
libgdcmMSFF.so.3.0()(64bit) \
libgdcmjpeg12.so.3.0()(64bit) \
libgdcmjpeg16.so.3.0()(64bit) \
libgdcmjpeg8.so.3.0()(64bit) \
libgdcmmd5.so.3.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcharls.so.2()(64bit) \
libcrypto.so.3()(64bit) \
libexpat.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libjson-c.so.5()(64bit) \
libm.so.6()(64bit) \
libopenjp2.so.7()(64bit) \
libsocketxx.so.1.2()(64bit) \
libstdc++.so.6()(64bit) \
libuuid.so.1()(64bit) \
libz.so.1()(64bit)"

inherit rpm
