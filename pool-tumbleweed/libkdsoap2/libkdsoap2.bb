SUMMARY = "A Qt-based client-side and server-side SOAP component"
DESCRIPTION = "KD Soap is a Qt-based client-side and server-side SOAP component. \
This package provides the library for the client-side component."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "libkdsoap2-2.1.1-1.4.aarch64.rpm"
RPM_HASH = "78e67ad57c254b246fa88f6341dd07ca83ca8bd5c1454e029a135885da69926c1586437457f9608e9e671e72d6d83312a3a0bb5cca68e62cf45575d26de41173"

RPROVIDES:${PN} += "libkdsoap.so.2 \
libkdsoap2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
