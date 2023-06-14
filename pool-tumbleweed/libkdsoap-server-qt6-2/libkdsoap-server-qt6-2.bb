SUMMARY = "A Qt-based client-side and server-side SOAP component"
DESCRIPTION = "KD Soap is a Qt-based client-side and server-side SOAP component. \
This package provides the library for the server-side component."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "libkdsoap-server-qt6-2-2.1.1-1.3.aarch64.rpm"
RPM_HASH = "da6b2b2eef6b00163bcd9fbf2f3999a3e7f985beb088a45e1aa69640370ae8102994f9ab9407b40cc3f5d7d893b24202f9fd96a870c1956089475783c1825b73"

RPROVIDES:${PN} += "libkdsoap-server-qt6-2 \
libkdsoap-server-qt6.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libkdsoap-qt6.so.2 \
libstdc++.so.6"

inherit rpm
