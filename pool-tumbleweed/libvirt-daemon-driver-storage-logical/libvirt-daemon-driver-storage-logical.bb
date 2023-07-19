SUMMARY = "Storage driver plugin for lvm volumes"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for block \
volumes using lvm."
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-daemon-driver-storage-logical-9.5.0-1.1.aarch64.rpm"
RPM_HASH = "22a28f409dfc6979b0ba66dea05dc5fed8381412336128f027340912db979da571e56064dfc061d926a0ffbdc0561922756011f2e10a2041e2b54867bdc3d550"

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
