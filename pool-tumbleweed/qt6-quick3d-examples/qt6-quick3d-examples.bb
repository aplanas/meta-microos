SUMMARY = "Examples for the qt6-quick3d modules"
DESCRIPTION = "Examples for the qt6-quick3d modules."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3d-examples-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "ba97bd289801edaeeda811641136ba720a238f57b538c428e69ac2217da3b043ec0feb8b8eb7e9eec1f47fdbdb9059a65329e36e46ec2846d9dff8dc7d291c67"

RPROVIDES:${PN} += "qt6-quick3d-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Quick3D.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
