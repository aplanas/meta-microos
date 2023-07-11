SUMMARY = "A Qt-based client-side and server-side SOAP component"
DESCRIPTION = "KD Soap is a Qt-based client-side and server-side SOAP component. \
This package provides the library for the server-side component."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "libkdsoap-server-qt6-2-2.1.1-1.4.aarch64.rpm"
RPM_HASH = "5249b7142054a9bd9f55fe504874cf34e63dc14d2ad65ef8a63d32964ba89431e373f3371b84c2df61c0ec362a4bb277f64b7ad38842959031046dbef27d3815"

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
