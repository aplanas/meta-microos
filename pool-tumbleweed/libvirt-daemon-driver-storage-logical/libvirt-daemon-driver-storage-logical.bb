SUMMARY = "Storage driver plugin for lvm volumes"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for block \
volumes using lvm."
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-daemon-driver-storage-logical-9.5.0-2.1.aarch64.rpm"
RPM_HASH = "00e89d83ba389b9a10cd7d3bf2dfd69053bdeb1945bcfbff67cc9068612e7a12a9e7f8610789465495d113119e12d32b3249d2e642fb6b6a6c3dc787b8e802a9"

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
