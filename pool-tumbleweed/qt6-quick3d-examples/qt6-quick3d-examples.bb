SUMMARY = "Examples for the qt6-quick3d modules"
DESCRIPTION = "Examples for the qt6-quick3d modules."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3d-examples-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "f81da6d188c1fad1cc98550ed685e0e652e09f148badceffe7741904e4119c381aae438c81a121e1ebf9c29a0d30ef5a4b711e085e97822e3ffb0ce4d75e5042"

RPROVIDES:${PN} += "qt6-quick3d-examples \
qt6-quick3d-examples(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libQt6Quick.so.6()(64bit) \
libQt6Quick.so.6(Qt_6)(64bit) \
libQt6Quick3D.so.6()(64bit) \
libQt6Quick3D.so.6(Qt_6)(64bit) \
libQt6Widgets.so.6()(64bit) \
libQt6Widgets.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
