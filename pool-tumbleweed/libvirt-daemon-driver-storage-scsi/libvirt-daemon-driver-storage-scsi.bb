SUMMARY = "Storage driver plugin for local scsi devices"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for scsi \
host devices."
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-daemon-driver-storage-scsi-9.5.0-2.1.aarch64.rpm"
RPM_HASH = "88a1938999e580bbaa8648b0b520b915b7450075c97c7f03e78b44c9c14c3a26555ca308edf4b1299df65ff87849cfce8fda020b720bf3aa6a0602fd20c32094"

RPROVIDES:${PN} += "libvirt-daemon-driver-storage-scsi \
libvirt-storage-backend-scsi.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libvirt-daemon-driver-storage-core \
libvirt-libs \
libvirt.so.0"

inherit rpm
