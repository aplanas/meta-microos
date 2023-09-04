SUMMARY = "Storage driver plugin for iscsi"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for iscsi \
volumes using the host iscsi stack."
LICENSE = "LGPL-2.1-or-later"

PV = "9.6.0"

RPM_NAME = "libvirt-daemon-driver-storage-iscsi-9.6.0-2.1.aarch64.rpm"
RPM_HASH = "c2586c9ffaf90706975b8a79858302f92af95551045ab21850bd783bd2809f5c5595db1b405186dddcf09138f1d5cc5668e3d521406719ba0a85ca0760d1fddd"

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
