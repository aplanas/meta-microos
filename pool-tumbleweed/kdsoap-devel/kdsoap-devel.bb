SUMMARY = "Development files for kdsoap, a Qt-based client and server-side SOAP component"
DESCRIPTION = "KD Soap is a Qt-based client-side and server-side SOAP component. \
This package provides development headers to use KD Soap in Qt based \
applications."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "kdsoap-devel-2.1.1-1.3.aarch64.rpm"
RPM_HASH = "a1d2d1ba405c8623b9cd1edbbbda6332d7efefe4a548936aed0265883d45719476187f39b0f124b519fcbded4e6072e24430277a313e6878fcad05211cc6a995"

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
