SUMMARY = "lockd client plugin for virtlockd"
DESCRIPTION = "A client-side plugin that implements disk locking using POSIX fcntl advisory \
locks via communication with the virtlockd daemon"
LICENSE = "LGPL-2.1-or-later"

PV = "9.7.0"

RPM_NAME = "libvirt-daemon-plugin-lockd-9.7.0-1.1.aarch64.rpm"
RPM_HASH = "3d9297a7fd5814b3d35aa1d5f282d790366f9d41d67969d60e079e959472afaf047e689257cc1ee1f82077291c3e44e05033d1caac1c6df5c7aac322541a1efa"

RPROVIDES:${PN} += "libvirt-daemon-plugin-lockd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libtirpc.so.3 \
libvirt-libs \
libvirt.so.0"

inherit rpm
