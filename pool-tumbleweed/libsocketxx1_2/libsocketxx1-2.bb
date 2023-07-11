SUMMARY = "Libsocket Library for applications that use gdcm"
DESCRIPTION = "This package contains a shared library required by applications that \
are using gdcm for DICOM processing."
LICENSE = "BSD-3-Clause"

PV = "3.0.21"

RPM_NAME = "libsocketxx1_2-3.0.21-1.8.aarch64.rpm"
RPM_HASH = "8bda316705764ea103264f1d91dd94be1d2149c844512a9e84eb0509176e229d4d3e46ae6c267b35399b4b78a36064c7032d0875fece3374e6d2071932c16b96"

RPROVIDES:${PN} += "libsocketxx.so.1.2 \
libsocketxx1-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
