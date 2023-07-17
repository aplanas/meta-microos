SUMMARY = "Examples for the qt6-httpserver modules"
DESCRIPTION = "Examples for the qt6-httpserver modules."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-httpserver-examples-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "4f761dc708a54dd06fb8a041e0054a0e7ede417b5d435a238533c8df8ceb3f23fd22dc6c82eed0b35e557dbeb779aae1bed532fc683d9f10736a6f34e58a9fe1"

RPROVIDES:${PN} += "qt6-httpserver-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6HttpServer.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
