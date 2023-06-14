SUMMARY = "DICOM medical file parser library"
DESCRIPTION = "This package contains the shared library required by applications that \
are using gdcm for DICOM processing."
LICENSE = "BSD-3-Clause"

PV = "3.0.21"

RPM_NAME = "libgdcm3_0-3.0.21-1.5.aarch64.rpm"
RPM_HASH = "65a62dabe1dc1d08ae23c0f0e5f43f5b72217b22d1e5c1ea90e11d232d2c45683ed3380787c5cff897919a05dcb4060cc07483397dbd885d74eb497e75b31c86"

RPROVIDES:${PN} += "libgdcm3-0 \
libgdcmCommon.so.3.0 \
libgdcmDICT.so.3.0 \
libgdcmDSED.so.3.0 \
libgdcmIOD.so.3.0 \
libgdcmMEXD.so.3.0 \
libgdcmMSFF.so.3.0 \
libgdcmjpeg12.so.3.0 \
libgdcmjpeg16.so.3.0 \
libgdcmjpeg8.so.3.0 \
libgdcmmd5.so.3.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcharls.so.2 \
libcrypto.so.3 \
libexpat.so.1 \
libgcc-s.so.1 \
libjson-c.so.5 \
libm.so.6 \
libopenjp2.so.7 \
libsocketxx.so.1.2 \
libstdc++.so.6 \
libuuid.so.1 \
libz.so.1"

inherit rpm
