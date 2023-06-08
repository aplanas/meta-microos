SUMMARY = "NetworkManager VPN support for iodine"
DESCRIPTION = "A network manager VPN plugin that allows you to tunnel your connection \
through a DNS tunnel. This can be useful if internet access is \
firewalled but DNS traffic is still allowed."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.0"

RPM_NAME = "NetworkManager-iodine-1.2.0-7.3.aarch64.rpm"
RPM_HASH = "87fcafe7009ed6bebff8eb5b17be3f7ff5d2156ec64f58f31fb0ba46e026f5cf98c9cc83c05877b1beb944959482ecfaaff33bde2eee8523a5c62ea628a149e9"

RPROVIDES:${PN} += "NetworkManager-iodine NetworkManager-iodine(aarch-64) group(nm-iodine) libnm-vpn-plugin-iodine.so()(64bit) user(nm-iodine)"
RDEPENDS:${PN} += "/bin/sh NetworkManager iodine ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libnm.so.0()(64bit) libnm.so.0(libnm_1_0_0)(64bit) libnm.so.0(libnm_1_2_0)(64bit)"

inherit rpm
