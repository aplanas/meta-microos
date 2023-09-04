SUMMARY = "Qt6 WebEngineWidgets library"
DESCRIPTION = "The Qt6 WebEngineWidgets library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6WebEngineWidgets6-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "f92d5cdba811e68a905e6e53117ed5fc1987f8e96d1fc42e0808a130738feac87faae0882969337eb0f195820873accd70b9ac0c5710de70b3e18de4e5e1856f"

RPROVIDES:${PN} += "libQt6WebEngineWidgets.so.6 \
libQt6WebEngineWidgets6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6Quick.so.6 \
libQt6QuickWidgets.so.6 \
libQt6WebEngineCore.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
