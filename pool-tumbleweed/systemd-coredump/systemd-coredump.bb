SUMMARY = "Systemd tools for coredump management"
DESCRIPTION = "Systemd tools to store and manage coredumps. \
 \
Visit https://systemd.io/COREDUMP for more details."
LICENSE = "LGPL-2.1-or-later"

PV = "253.8"

RPM_NAME = "systemd-coredump-253.8-1.2.aarch64.rpm"
RPM_HASH = "1e4019e52efbde558a6238d002024f7ffa32acbfdcb91bf773dfec08d3dc0c95f3a9104b6cce203730b525626d8017833136b3a7db0493c0b6b0623fe57a34f2"

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
