SUMMARY = "Facebook protocol plugin for libpurple"
DESCRIPTION = "Purple Facebook implements the Facebook Messenger protocol into \
pidgin, finch, and libpurple. While the primary implementation is \
for libpurple3, this plugin is backported for libpurple2."
LICENSE = "GPL-2.0+"

PV = "0.9.6"

RPM_NAME = "libpurple-plugin-facebook-0.9.6-1.22.aarch64.rpm"
RPM_HASH = "42657073f43f5b9b3b23a65aefaa23f652ab21991a13ccf2de0cc6b2016cf262b23b3c7164eebafb61b88143b322a871cce586c085da81bea16d93e2e9442652"

RPROVIDES:${PN} += "libfacebook.so()(64bit) \
libpurple-plugin-facebook \
libpurple-plugin-facebook(aarch-64) \
purple-facebook"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) \
libpurple.so.0()(64bit) \
libz.so.1()(64bit)"

inherit rpm
