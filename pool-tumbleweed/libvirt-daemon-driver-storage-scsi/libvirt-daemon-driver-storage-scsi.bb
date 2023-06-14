SUMMARY = "Storage driver plugin for local scsi devices"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for scsi \
host devices."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-daemon-driver-storage-scsi-9.4.0-1.1.aarch64.rpm"
RPM_HASH = "5d5efc0cfe8d4b3757324319f65dd9ee55293c250ad7f98cde70300905a48115c1d6bca649da6ca31526d20330cd7ac168105479a6395df4ee33415031ef854a"

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
