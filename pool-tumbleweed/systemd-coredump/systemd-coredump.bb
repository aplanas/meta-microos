SUMMARY = "Systemd tools for coredump management"
DESCRIPTION = "Systemd tools to store and manage coredumps. \
 \
Visit https://systemd.io/COREDUMP for more details."
LICENSE = "LGPL-2.1-or-later"

PV = "253.5"

RPM_NAME = "systemd-coredump-253.5-5.1.aarch64.rpm"
RPM_HASH = "a302fd9ba165addfbc0107f40593d6f46899ed54a80f31c889b0e40cf34afd1767b85ba08e7388bb183c74c5a2c385c11a26d7b62d94c3e6a98cdb0b439fc0ca"

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
