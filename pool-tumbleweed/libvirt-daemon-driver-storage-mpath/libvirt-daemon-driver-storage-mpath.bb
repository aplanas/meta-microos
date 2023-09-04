SUMMARY = "Storage driver plugin for multipath volumes"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for \
multipath storage using device mapper."
LICENSE = "LGPL-2.1-or-later"

PV = "9.6.0"

RPM_NAME = "libvirt-daemon-driver-storage-mpath-9.6.0-2.1.aarch64.rpm"
RPM_HASH = "6637584197e8e670ea16e777ba6e1a25f5f86c54f4c0235641777dbf50162b37c466cfb09d8ce385a94e5e102ce133f9831783f1e5a0b37a21c322910a4a8a8d"

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
