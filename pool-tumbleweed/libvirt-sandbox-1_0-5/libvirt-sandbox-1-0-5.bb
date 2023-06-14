SUMMARY = "Libvirt application sandbox framework libraries"
DESCRIPTION = "This package provides a framework for building application sandboxes \
using libvirt."
LICENSE = "LGPL-2.0-or-later"

PV = "0.8.0"

RPM_NAME = "libvirt-sandbox-1_0-5-0.8.0-5.3.aarch64.rpm"
RPM_HASH = "1da0944b187db239820e973c9fa44cd1b38c65f474c4fc82ee587a527ae3ef5b76e6d44fdfec0800c263b7632b577d4c4610be709b95f74320c6c71981414ac8"

RPROVIDES:${PN} += "config-libvirt-sandbox-1-0-5 \
libvirt-sandbox-1-0-5 \
libvirt-sandbox-1.0.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
liblzma.so.5 \
libselinux.so.1 \
libtirpc.so.3 \
libvirt-daemon-lxc \
libvirt-daemon-qemu \
libvirt-gconfig-1.0.so.0 \
libvirt-gobject-1.0.so.0 \
libz.so.1"

inherit rpm
