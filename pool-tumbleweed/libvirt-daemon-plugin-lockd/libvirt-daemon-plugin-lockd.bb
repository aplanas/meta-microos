SUMMARY = "lockd client plugin for virtlockd"
DESCRIPTION = "A client-side plugin that implements disk locking using POSIX fcntl advisory \
locks via communication with the virtlockd daemon"
LICENSE = "LGPL-2.1-or-later"

PV = "9.6.0"

RPM_NAME = "libvirt-daemon-plugin-lockd-9.6.0-3.1.aarch64.rpm"
RPM_HASH = "3b64310ae6f37597dc295d6c5cecdaeba8c124125543996c5e9ff42cfcb2c8bd880e87d8894f5424ebb17b10344d6995c04e469dd8271047b08dde0d6f226741"

RPROVIDES:${PN} += "libvirt-daemon-plugin-lockd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libtirpc.so.3 \
libvirt-libs \
libvirt.so.0"

inherit rpm
