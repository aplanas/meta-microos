SUMMARY = "Examples for the qt6-httpserver modules"
DESCRIPTION = "Examples for the qt6-httpserver modules."
LICENSE = "GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-httpserver-examples-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "5b7b4cac2213325365f2d974096156fe7f7fd79d131e3369b47e8fbffb11b2d2727168d0a97cc651ef405c2dfc858ed4f499f79356d1a9bfba418ad5388d1fc1"

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
