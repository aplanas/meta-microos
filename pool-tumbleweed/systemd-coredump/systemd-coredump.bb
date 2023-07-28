SUMMARY = "Systemd tools for coredump management"
DESCRIPTION = "Systemd tools to store and manage coredumps. \
 \
Visit https://systemd.io/COREDUMP for more details."
LICENSE = "LGPL-2.1-or-later"

PV = "253.7"

RPM_NAME = "systemd-coredump-253.7-1.2.aarch64.rpm"
RPM_HASH = "2e75a716214a0902669b28f662b59c8dc469a0263862ef96e8238ac84f0e6549b4a07b4010cf6711e123c6e8ebf21457de3965f198f5c734bf8625ce1bbe63a8"

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
