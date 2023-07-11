SUMMARY = "Private library for Budgie Menu"
DESCRIPTION = "Private library for Budgie menu to link against."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.7.2+0"

RPM_NAME = "libbudgie-appindexer0-10.7.2+0-1.2.aarch64.rpm"
RPM_HASH = "fa253aa4102ce64d45a923ea8b6a127810bba022662904311561f56f4e4ec8c0a0426266e116d07acbbdc123d072c41de79c91ab4b3b6f2e994d3ae5e9d532ea"

RPROVIDES:${PN} += "libbudgie-appindexer.so.0 \
libbudgie-appindexer0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
