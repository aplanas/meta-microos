SUMMARY = "D-Bus Service to Manipulate User Account Information"
DESCRIPTION = "The accountsservice server provides a set of D-Bus interfaces for \
querying and manipulating user account information. \
 \
The implementation is based on the useradd, usermod and userdel \
commands."
LICENSE = "GPL-3.0-or-later"

PV = "23.13.9"

RPM_NAME = "accountsservice-23.13.9-4.1.aarch64.rpm"
RPM_HASH = "1295fe5e5c31af54121a5f195d07a7351f6d84f2f32b07fcda4d9c985ccade0a46a9eed6c3c357dae6cd9c7f57d35e8239b129dcac4d5bfe239a45032b8d9341"

RPROVIDES:${PN} += "accountsservice"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpolkit-gobject-1.so.0"

inherit rpm
