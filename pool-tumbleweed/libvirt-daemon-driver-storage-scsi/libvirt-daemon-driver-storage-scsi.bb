SUMMARY = "Storage driver plugin for local scsi devices"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for scsi \
host devices."
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-daemon-driver-storage-scsi-9.5.0-1.1.aarch64.rpm"
RPM_HASH = "dbc193587e3bbe86475bd714126f4d3cd9e41a48389f828bcfbc1b5e524045f6fcba43d6b42992c94e2bb417e1c17adbadabc751a1903d129f07e1dae0656aa5"

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
