SUMMARY = "Libvirt application sandbox framework libraries"
DESCRIPTION = "This package provides a framework for building application sandboxes \
using libvirt."
LICENSE = "LGPL-2.0-or-later"

PV = "0.8.0"

RPM_NAME = "libvirt-sandbox-1_0-5-0.8.0-5.4.aarch64.rpm"
RPM_HASH = "ff8906d7834498ece85e5cf6c378222f572caa3e45ed522e150656591edff7e0d3b93800079222e19fd810c6b187162cd57c3ac333699d471395b263484516e2"

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
