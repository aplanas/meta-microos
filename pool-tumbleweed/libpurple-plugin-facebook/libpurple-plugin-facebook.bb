SUMMARY = "Facebook protocol plugin for libpurple"
DESCRIPTION = "Purple Facebook implements the Facebook Messenger protocol into \
pidgin, finch, and libpurple. While the primary implementation is \
for libpurple3, this plugin is backported for libpurple2."
LICENSE = "GPL-2.0+"

PV = "0.9.6"

RPM_NAME = "libpurple-plugin-facebook-0.9.6-1.23.aarch64.rpm"
RPM_HASH = "592bf7317a8873fef9b5c4e875982b09b29ff7fc488fc425d943912825eaef4ca17a577c8b8b7bee12aa3bafcf24b60e09656abffe50d96b3d2d7ddbc3a28966"

RPROVIDES:${PN} += "libfacebook.so \
libpurple-plugin-facebook \
purple-facebook"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libpurple.so.0 \
libz.so.1"

inherit rpm
