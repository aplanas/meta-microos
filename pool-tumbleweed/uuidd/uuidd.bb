SUMMARY = "Helper daemon to guarantee uniqueness of time-based UUIDs"
DESCRIPTION = "The uuidd package contains a userspace daemon (uuidd) which guarantees \
uniqueness of time-based UUID generation even at very high rates on \
SMP systems."
LICENSE = "GPL-2.0-or-later"

PV = "2.39"

RPM_NAME = "uuidd-2.39-2.1.aarch64.rpm"
RPM_HASH = "bded790f26cafad037b66f4c2cd05daed5de0f62b249a5c0e55ffb483c0582c5493f6a8998cc8719d3dedb58004eaf98f937d39dc7b6bea4eb495a553a089a05"

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
