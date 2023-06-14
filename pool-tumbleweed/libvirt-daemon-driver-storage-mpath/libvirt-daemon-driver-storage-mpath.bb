SUMMARY = "Storage driver plugin for multipath volumes"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for \
multipath storage using device mapper."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-daemon-driver-storage-mpath-9.4.0-1.1.aarch64.rpm"
RPM_HASH = "8580c7627182a88bbe488988cd3bed4e6b2142271bad60cefda54cc537865c24a2110bd598b8eed1b6b166bc4159435bcc144174071204fbfdb442ae226295ed"

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
