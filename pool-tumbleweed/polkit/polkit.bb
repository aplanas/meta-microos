SUMMARY = "PolicyKit Authorization Framework"
DESCRIPTION = "PolicyKit is a toolkit for defining and handling authorizations. \
It is used for allowing unprivileged processes to speak to privileged \
processes."
LICENSE = "LGPL-2.1-or-later"

PV = "121"

RPM_NAME = "polkit-121-4.3.aarch64.rpm"
RPM_HASH = "b71eeab48dc517a4612f1bbb5b54b8bb03372e7404b9148c19afa00232c2fd55f1a2a15e6121d2494a4d1b4a7916c3c5e2a4103340f455b89da45f41b31ae353"

RPROVIDES:${PN} += "group-polkitd \
polkit \
user-polkitd"

RDEPENDS:${PN} += "/usr/bin/sh \
dbus-1 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libduktape.so.207 \
libexpat.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpam.so.0 \
libpolkit-agent-1-0 \
libpolkit-agent-1.so.0 \
libpolkit-gobject-1-0 \
libpolkit-gobject-1.so.0 \
libsystemd.so.0 \
permissions \
sysuser-shadow"

inherit rpm
