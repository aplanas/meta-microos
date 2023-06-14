SUMMARY = "Private library for Budgie Menu"
DESCRIPTION = "Private library for Budgie menu to link against."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.7.2+0"

RPM_NAME = "libbudgie-appindexer0-10.7.2+0-1.1.aarch64.rpm"
RPM_HASH = "aef272b708c688e4fb73a33dbf829e9dc80d5b05c107eb20d3cfb7fc4e59ee4463de80a7d5a7be605379d3d6242d647faeaeb8f3af929138ea53bf129ccc895a"

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
