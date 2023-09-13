SUMMARY = "Storage driver plugin for lvm volumes"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for block \
volumes using lvm."
LICENSE = "LGPL-2.1-or-later"

PV = "9.7.0"

RPM_NAME = "libvirt-daemon-driver-storage-logical-9.7.0-1.1.aarch64.rpm"
RPM_HASH = "fb2dc4cd9c83c20897bbd0841a26f611b18d3fb7e07145a987c97cc8ac37b142198086bb89ad3c673ac38ea28b946555e5e0b03206cffd379686aaa001ba7ea5"

RPROVIDES:${PN} += "libvirt-daemon-driver-storage-logical \
libvirt-storage-backend-logical.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libvirt-daemon-driver-storage-core \
libvirt-libs \
libvirt.so.0 \
lvm2"

inherit rpm
