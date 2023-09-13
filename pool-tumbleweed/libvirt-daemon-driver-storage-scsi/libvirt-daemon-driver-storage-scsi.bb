SUMMARY = "Storage driver plugin for local scsi devices"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for scsi \
host devices."
LICENSE = "LGPL-2.1-or-later"

PV = "9.7.0"

RPM_NAME = "libvirt-daemon-driver-storage-scsi-9.7.0-1.1.aarch64.rpm"
RPM_HASH = "53ec0197c552ceaafb3b0c6165ffee7ba4c42b6dfc3eacb70990081853970f6b461d74bb814296db800b2c294ad38b0665f0ca2e0aa5b02f734600a57483c789"

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
