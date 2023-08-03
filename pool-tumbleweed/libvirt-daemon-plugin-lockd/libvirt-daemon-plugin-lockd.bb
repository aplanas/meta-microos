SUMMARY = "lockd client plugin for virtlockd"
DESCRIPTION = "A client-side plugin that implements disk locking using POSIX fcntl advisory \
locks via communication with the virtlockd daemon"
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-daemon-plugin-lockd-9.5.0-2.1.aarch64.rpm"
RPM_HASH = "9be75cebafbc70ec505f39858bc6153e98d878a4a83a0b55a8c30f3a50471bea76bdcbc2c1e86f683062d0eb356490f947d6d7d12a2b6a37f7f1c36abb587c00"

RPROVIDES:${PN} += "libvirt-daemon-plugin-lockd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libtirpc.so.3 \
libvirt-libs \
libvirt.so.0"

inherit rpm
