SUMMARY = "Systemd tools for coredump management"
DESCRIPTION = "Systemd tools to store and manage coredumps. \
 \
Visit https://systemd.io/COREDUMP for more details."
LICENSE = "LGPL-2.1-or-later"

PV = "253.4"

RPM_NAME = "systemd-coredump-253.4-2.1.aarch64.rpm"
RPM_HASH = "e96a073df7be4cd97c8568a201b7e55ea704f514ae0b00c658c00b306ba4be8f9c6664398df5a9926f0e9aa9f0f01b2a9d14fca9e168a9af18a297b66e09b46b"

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
