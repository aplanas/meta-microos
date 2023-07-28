SUMMARY = "Libsocket Library for applications that use gdcm"
DESCRIPTION = "This package contains a shared library required by applications that \
are using gdcm for DICOM processing."
LICENSE = "BSD-3-Clause"

PV = "3.0.21"

RPM_NAME = "libsocketxx1_2-3.0.21-1.9.aarch64.rpm"
RPM_HASH = "96704219b7a6e7b056cb457da1ad794d52a26448af5ef4101a3b5d389fca4953d05522e7c6bf2ce48d30855f5c21bef5e3e4e4a2e841ad02e5eeec9ca8f5ee6f"

RPROVIDES:${PN} += "libsocketxx.so.1.2 \
libsocketxx1-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
