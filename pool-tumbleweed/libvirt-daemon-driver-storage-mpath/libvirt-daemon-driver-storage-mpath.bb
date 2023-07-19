SUMMARY = "Storage driver plugin for multipath volumes"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for \
multipath storage using device mapper."
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-daemon-driver-storage-mpath-9.5.0-1.1.aarch64.rpm"
RPM_HASH = "bf7fa3e37f009252678afcd0df2beba001567ea5c1b84e4a08369936f374bb1d5c43848ea6c0436d7e1ebbd1efb246a05440cdab17cfae7d20bbd10c1cf6ab0b"

RPROVIDES:${PN} += "libvirt-daemon-driver-storage-mpath \
libvirt-storage-backend-mpath.so"

RDEPENDS:${PN} += "device-mapper \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdevmapper.so.1.03 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libvirt-daemon-driver-storage-core \
libvirt-libs \
libvirt.so.0"

inherit rpm
