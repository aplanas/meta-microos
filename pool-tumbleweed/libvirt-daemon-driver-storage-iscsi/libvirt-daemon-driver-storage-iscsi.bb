SUMMARY = "Storage driver plugin for iscsi"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for iscsi \
volumes using the host iscsi stack."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-daemon-driver-storage-iscsi-9.4.0-1.1.aarch64.rpm"
RPM_HASH = "053563968fa6cd03692b04e443b091b9620e18a7baa35b5ab0e86f6050138eac2b95d7e14ab2130154d1c3c622a2d47fff7922d851284116ca9cf9ee5aa2e401"

RPROVIDES:${PN} += "libvirt-daemon-driver-storage-iscsi \
libvirt-storage-backend-iscsi.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libvirt-daemon-driver-storage-core \
libvirt-libs \
libvirt.so.0 \
open-iscsi"

inherit rpm
