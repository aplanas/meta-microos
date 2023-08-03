SUMMARY = "Systemd tools for coredump management"
DESCRIPTION = "Systemd tools to store and manage coredumps. \
 \
Visit https://systemd.io/COREDUMP for more details."
LICENSE = "LGPL-2.1-or-later"

PV = "253.7"

RPM_NAME = "systemd-coredump-253.7-2.1.aarch64.rpm"
RPM_HASH = "e081fe30ea22646bec5fe2bb4c3030241ce0ff0096157193f4ba65b8025a9f717d57831f588bdd8855d043c9e5d627996fc634c831cd65de2f4110dc5d770038"

RPROVIDES:${PN} += "config-systemd-coredump \
systemd-/usr/bin/coredumpctl \
systemd-coredump"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblz4.so.1 \
liblzma.so.5 \
libsystemd-shared-253.so \
libzstd.so.1 \
systemd"

inherit rpm
