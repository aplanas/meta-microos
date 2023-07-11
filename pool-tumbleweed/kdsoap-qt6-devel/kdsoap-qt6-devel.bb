SUMMARY = "Development files for kdsoap, a Qt-based client and server-side SOAP component"
DESCRIPTION = "KD Soap is a Qt-based client-side and server-side SOAP component. \
This package provides development headers to use KD Soap in Qt based \
applications."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "kdsoap-qt6-devel-2.1.1-1.4.aarch64.rpm"
RPM_HASH = "3a1553786d0c36b36b3728b775cfb970b0aaeec4361b4b612118bf4cb88468959f54f1c9f5f7ff042d9077e509eff47871cd1ebf2ee317cc1aabfddc1a074083"

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
