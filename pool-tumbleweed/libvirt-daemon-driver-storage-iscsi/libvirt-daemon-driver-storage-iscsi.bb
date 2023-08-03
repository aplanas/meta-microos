SUMMARY = "Storage driver plugin for iscsi"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for iscsi \
volumes using the host iscsi stack."
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-daemon-driver-storage-iscsi-9.5.0-2.1.aarch64.rpm"
RPM_HASH = "c19c376a39e6b9c685a4b168809b40959e9b3a3124a620c925462e9919df3c20619749ad127ac666f8041af6ab1d933295bdc656865d00361e0a42bb9da2fa36"

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
