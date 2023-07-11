SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin allows Psi+ to provide a different identification. For example a \
user can set Psi+ to tell others that the user is running Miranda on Windows \
instead of Psi+ on Linux."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-clientswitcherplugin-1.5.1615+0-3.2.aarch64.rpm"
RPM_HASH = "6f94b070a193311dca6b0d6f83822076baa8ba36f878e86c1497cdab9479512802d3955a4981f29f32e2c1f1a4565fc9c56c0f137103e8217a019c2823b50630"

RPROVIDES:${PN} += "libclientswitcherplugin.so \
psi+-plugins-clientswitcherplugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
psi+"

inherit rpm
