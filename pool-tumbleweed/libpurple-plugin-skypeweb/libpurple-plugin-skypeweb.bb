SUMMARY = "Libpurple plugin for SkypeWeb API"
DESCRIPTION = "This is a SkypeWeb Plugin for libpurple. It lets you view and chat \
with all your Skype buddies from within Pidgin."
LICENSE = "GPL-3.0-or-later"

PV = "1.7"

RPM_NAME = "libpurple-plugin-skypeweb-1.7-1.3.aarch64.rpm"
RPM_HASH = "316a772f1f3b0401fe6a3ecb4ae6b24a8e70f8465e14e5ee1a7fae675706a26160f55962c6e44805ecfb25f979dba8fee457e5cbc0dac7f8d33a4adcb3a7d844"

RPROVIDES:${PN} += "libpurple-plugin-skypeweb \
libpurple-plugin-skypeweb(aarch-64) \
libskypeweb.so()(64bit)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) \
libpurple.so.0()(64bit) \
libz.so.1()(64bit)"

inherit rpm
