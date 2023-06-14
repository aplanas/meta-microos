SUMMARY = "D-Bus API binding for libvirt"
DESCRIPTION = "This package provides D-Bus API for libvirt"
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.1"

RPM_NAME = "libvirt-dbus-1.4.1-3.7.aarch64.rpm"
RPM_HASH = "36f5a84dd5594b59eeaddd18d235624a2ce1acb4eff5dadddfb03b01c33dd37f4f658e723c766942b5809f99f9fc6d948db639a9edef2fe0085dc43062512ca1"

RPROVIDES:${PN} += "libvirt-dbus"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libvirt-glib-1.0.so.0 \
libvirt.so.0 \
polkit \
user-libvirtdbus"

inherit rpm
