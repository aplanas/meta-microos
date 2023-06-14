SUMMARY = "Libsocket Library for applications that use gdcm"
DESCRIPTION = "This package contains a shared library required by applications that \
are using gdcm for DICOM processing."
LICENSE = "BSD-3-Clause"

PV = "3.0.21"

RPM_NAME = "libsocketxx1_2-3.0.21-1.5.aarch64.rpm"
RPM_HASH = "7a3cc2ce4647dc9eaef1f6930b897865fd3f145d2f4b0f424dd602d017bc292a7d71f5e70617b05ac1240b57658076c5098289d91903cfadff39c80ed19f240f"

RPROVIDES:${PN} += "libsocketxx.so.1.2 \
libsocketxx1-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
