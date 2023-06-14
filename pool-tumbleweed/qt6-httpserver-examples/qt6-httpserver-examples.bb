SUMMARY = "Examples for the qt6-httpserver modules"
DESCRIPTION = "Examples for the qt6-httpserver modules."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-httpserver-examples-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "69a71a53465486506ba39f4fb2fe1d9916ca84478e02e9e31f715fcb34078e669d62072abe8cd73e740574523aeb8aa092926875322868452b21ee87550bafb7"

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
