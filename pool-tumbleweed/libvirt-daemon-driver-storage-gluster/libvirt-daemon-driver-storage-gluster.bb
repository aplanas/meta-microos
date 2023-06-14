SUMMARY = "Storage driver plugin for gluster"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for gluster \
volumes using libgfapi."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-daemon-driver-storage-gluster-9.4.0-1.1.aarch64.rpm"
RPM_HASH = "79c961be7a37897d44a20abe855f4ac5ff95ab06e4207daa53074484b3e09fb43b3706c4e809d883f11878ddb507c05a504891b1bb29bd2ae0a34ad68fd03fa5"

RPROVIDES:${PN} += "libvirt-daemon-driver-storage-gluster \
libvirt-storage-backend-gluster.so \
libvirt-storage-file-gluster.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfapi.so.0 \
libglib-2.0.so.0 \
libvirt-daemon-driver-storage-core \
libvirt-libs \
libvirt.so.0"

inherit rpm
