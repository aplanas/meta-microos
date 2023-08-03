SUMMARY = "Helper daemon to guarantee uniqueness of time-based UUIDs"
DESCRIPTION = "The uuidd package contains a userspace daemon (uuidd) which guarantees \
uniqueness of time-based UUID generation even at very high rates on \
SMP systems."
LICENSE = "GPL-2.0-or-later"

PV = "2.39.1"

RPM_NAME = "uuidd-2.39.1-1.1.aarch64.rpm"
RPM_HASH = "b88906cb0b466d14cccd357ac53c88a8a6f7c14781682bb9e7f787f3cf38108374005da156e4bea1f0e0159442efa784f09a1fb8e78d42a59a7294776b3b8a8d"

RPROVIDES:${PN} += "uuid-runtime \
uuidd"

RDEPENDS:${PN} += "/usr/bin/sh \
group-uuidd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd.so.0 \
libuuid--uuid-generate-time-cont \
libuuid.so.1 \
systemd \
user-uuidd"

inherit rpm
