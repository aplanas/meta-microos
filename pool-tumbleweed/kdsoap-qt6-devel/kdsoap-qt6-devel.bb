SUMMARY = "Development files for kdsoap, a Qt-based client and server-side SOAP component"
DESCRIPTION = "KD Soap is a Qt-based client-side and server-side SOAP component. \
This package provides development headers to use KD Soap in Qt based \
applications."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "kdsoap-qt6-devel-2.1.1-1.3.aarch64.rpm"
RPM_HASH = "5f5cebcb91fa683749c984aa0a339e888cfef542b054d58d7a6c0e55ace75712c0ff1d7b99e8b8c7db8e946f80cf2d13d40d676cbda63dac29cdb71d2e568225"

RPROVIDES:${PN} += "cmake-KDSoap-qt6 \
kdsoap-qt6-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libkdsoap-qt6-2 \
libkdsoap-server-qt6-2 \
libstdc++.so.6"

inherit rpm
