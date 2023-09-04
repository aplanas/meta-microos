SUMMARY = "Storage driver plugin for local scsi devices"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for scsi \
host devices."
LICENSE = "LGPL-2.1-or-later"

PV = "9.6.0"

RPM_NAME = "libvirt-daemon-driver-storage-scsi-9.6.0-2.1.aarch64.rpm"
RPM_HASH = "d7b5b6b516df5ff105e53c3cb518e7d4ec35cc40d0dff4b7ccfa9a49de58231a25f1ebe494cdf1f89e19e3caf31564ee56cb6d024a49b1062b0fc51cc7bceb3d"

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
