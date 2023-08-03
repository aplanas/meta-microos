SUMMARY = "Examples for the qt6-networkauth modules"
DESCRIPTION = "Examples for the qt6-networkauth modules."
LICENSE = "GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.2"

RPM_NAME = "qt6-networkauth-examples-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "cb097f7bb5021c2cd5abd1fa9336a13c15b7e4ba4f45cc3c7c80d71ae6383e29648f3d0e10cd4bf3840112df84d742840a37e243156fba6138e52f92b9c8c6c5"

RPROVIDES:${PN} += "qt6-networkauth-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6NetworkAuth.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
