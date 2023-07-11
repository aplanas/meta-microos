SUMMARY = "Development files for kdsoap, a Qt-based client and server-side SOAP component"
DESCRIPTION = "KD Soap is a Qt-based client-side and server-side SOAP component. \
This package provides development headers to use KD Soap in Qt based \
applications."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "kdsoap-devel-2.1.1-1.4.aarch64.rpm"
RPM_HASH = "de91131f1860572ce1be327e2a02f5c40e5aebbebce9e862653792de63f89173c2ddd0ba9067ab79646f52235c1c7c2b71101c55c7e201423c822ac90df00493"

RPROVIDES:${PN} += "cmake-KDSoap \
kdsoap-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libkdsoap-server2 \
libkdsoap2 \
libstdc++.so.6"

inherit rpm
