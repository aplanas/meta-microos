SUMMARY = "lockd client plugin for virtlockd"
DESCRIPTION = "A client-side plugin that implements disk locking using POSIX fcntl advisory \
locks via communication with the virtlockd daemon"
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-daemon-plugin-lockd-9.4.0-1.1.aarch64.rpm"
RPM_HASH = "e22e5706274227d2c616ab93ca5562e4dc2e2a27aaccc3a52121a49cd20a3767c434f5b10ccf6d2c516bf233d561d595feea5a185def46288a1ef870e9e29061"

RPROVIDES:${PN} += "libvirt-daemon-plugin-lockd \
libvirt-daemon-plugin-lockd(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libglib-2.0.so.0()(64bit) \
libtirpc.so.3()(64bit) \
libtirpc.so.3(TIRPC_0.3.0)(64bit) \
libvirt-libs \
libvirt.so.0()(64bit) \
libvirt.so.0(LIBVIRT_0.1.0)(64bit) \
libvirt.so.0(LIBVIRT_PRIVATE_9.4.0)(64bit)"

inherit rpm
