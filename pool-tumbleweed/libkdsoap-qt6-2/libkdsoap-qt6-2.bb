SUMMARY = "A Qt-based client-side and server-side SOAP component"
DESCRIPTION = "KD Soap is a Qt-based client-side and server-side SOAP component. \
This package provides the library for the client-side component."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "libkdsoap-qt6-2-2.1.1-1.4.aarch64.rpm"
RPM_HASH = "9a6c56ab3f5c97ee7ee8e5e50a1b21a2ca15c8015e223ce50bb7564d298382372ef3a0d94940990d6257e7788120eb8f6eafe47fac5e616454049a07f6bef0d5"

RPROVIDES:${PN} += "libkdsoap-qt6-2 \
libkdsoap-qt6.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
