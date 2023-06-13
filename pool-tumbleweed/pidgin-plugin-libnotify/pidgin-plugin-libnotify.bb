SUMMARY = "Pidgin plugin for notifications using libnotify"
DESCRIPTION = "Provides an interface to libnotify for Pidgin notifications."
LICENSE = "GPL-3.0+"

PV = "0.14"

RPM_NAME = "pidgin-plugin-libnotify-0.14-1.26.aarch64.rpm"
RPM_HASH = "025a11fcad8db97ca8ef35fa78e1ac51b84a4fdd41306e0ecc02c88425057db651a974fde377b2824c1528a21fbc0856cedeef1378160f54f5b1ca55b405675a"

RPROVIDES:${PN} += "pidgin-libnotify \
pidgin-plugin-libnotify \
pidgin-plugin-libnotify(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libnotify.so.4()(64bit) \
pidgin"

inherit rpm
