SUMMARY = "NetworkManager VPN support for iodine"
DESCRIPTION = "A network manager VPN plugin that allows you to tunnel your connection \
through a DNS tunnel. This can be useful if internet access is \
firewalled but DNS traffic is still allowed."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.0"

RPM_NAME = "NetworkManager-iodine-1.2.0-7.3.aarch64.rpm"
RPM_HASH = "87fcafe7009ed6bebff8eb5b17be3f7ff5d2156ec64f58f31fb0ba46e026f5cf98c9cc83c05877b1beb944959482ecfaaff33bde2eee8523a5c62ea628a149e9"

RPROVIDES:${PN} += "NetworkManager-iodine \
group-nm-iodine \
libnm-vpn-plugin-iodine.so \
user-nm-iodine"

RDEPENDS:${PN} += "/bin/sh \
NetworkManager \
iodine \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libnm.so.0"

inherit rpm
