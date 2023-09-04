SUMMARY = "lockd client plugin for virtlockd"
DESCRIPTION = "A client-side plugin that implements disk locking using POSIX fcntl advisory \
locks via communication with the virtlockd daemon"
LICENSE = "LGPL-2.1-or-later"

PV = "9.6.0"

RPM_NAME = "libvirt-daemon-plugin-lockd-9.6.0-2.1.aarch64.rpm"
RPM_HASH = "d5bf0fd53acf3ef59b37acfddf591f26231a2ee5cfbf50a1e543cdeeea38caffad6610894ec8c6c1a43f2164e17107808c63e74f7b3e093271cc3e8ca0efdd0b"

RPROVIDES:${PN} += "libvirt-daemon-plugin-lockd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libtirpc.so.3 \
libvirt-libs \
libvirt.so.0"

inherit rpm
