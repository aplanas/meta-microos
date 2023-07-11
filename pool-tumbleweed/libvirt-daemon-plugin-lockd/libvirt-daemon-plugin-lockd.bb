SUMMARY = "lockd client plugin for virtlockd"
DESCRIPTION = "A client-side plugin that implements disk locking using POSIX fcntl advisory \
locks via communication with the virtlockd daemon"
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-daemon-plugin-lockd-9.4.0-3.1.aarch64.rpm"
RPM_HASH = "1442c567a7521972d589dc065be4e89f82cd5d76e58622829e6bd2c1e5ed62b8743c47ba8e863848631f169997c96f0f38892f6717910b21d1d73ded5797e215"

RPROVIDES:${PN} += "libvirt-daemon-plugin-lockd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libtirpc.so.3 \
libvirt-libs \
libvirt.so.0"

inherit rpm
