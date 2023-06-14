SUMMARY = "NetworkManager VPN support for iodine"
DESCRIPTION = "A network manager VPN plugin that allows you to tunnel your connection \
through a DNS tunnel. This can be useful if internet access is \
firewalled but DNS traffic is still allowed."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.0"

RPM_NAME = "NetworkManager-iodine-gnome-1.2.0-7.3.aarch64.rpm"
RPM_HASH = "cfa153d154d7c4f13621420e35eec4a46c5e4a1399a78d8916f3f0ce20dba8e5e8f28191115a9d6223dd6912d92d705d2e153c817a71bc3d971a0eca1acf57d6"

RPROVIDES:${PN} += "NetworkManager-iodine-gnome"

RDEPENDS:${PN} += "NetworkManager-iodine \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libnm.so.0 \
libnma.so.0 \
libsecret-1.so.0"

inherit rpm
