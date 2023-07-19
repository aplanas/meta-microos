SUMMARY = "lockd client plugin for virtlockd"
DESCRIPTION = "A client-side plugin that implements disk locking using POSIX fcntl advisory \
locks via communication with the virtlockd daemon"
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-daemon-plugin-lockd-9.5.0-1.1.aarch64.rpm"
RPM_HASH = "f760bcdb48d0285b20a7c42b7d8608e9d9037bac07bdcc952f17cbe3116823488626481f93c540ad84fc532646acbbbd5e23e87932db56eddfdc3c08f7669a2f"

RPROVIDES:${PN} += "libvirt-daemon-plugin-lockd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libtirpc.so.3 \
libvirt-libs \
libvirt.so.0"

inherit rpm
