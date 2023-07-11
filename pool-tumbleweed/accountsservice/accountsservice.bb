SUMMARY = "D-Bus Service to Manipulate User Account Information"
DESCRIPTION = "The accountsservice server provides a set of D-Bus interfaces for \
querying and manipulating user account information. \
 \
The implementation is based on the useradd, usermod and userdel \
commands."
LICENSE = "GPL-3.0-or-later"

PV = "23.13.9"

RPM_NAME = "accountsservice-23.13.9-3.1.aarch64.rpm"
RPM_HASH = "2a6612120ab42d0e3a55bfb3a3b3939ce24dd99ef3562ac058695dbf525ce758f6aa2fca72020b73d71197b18e30b7a0f245d1c789d8ea4c60717efd982be6e8"

RPROVIDES:${PN} += "accountsservice"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpolkit-gobject-1.so.0"

inherit rpm
