SUMMARY = "Helper daemon to guarantee uniqueness of time-based UUIDs"
DESCRIPTION = "The uuidd package contains a userspace daemon (uuidd) which guarantees \
uniqueness of time-based UUID generation even at very high rates on \
SMP systems."
LICENSE = "GPL-2.0-or-later"

PV = "2.39.1"

RPM_NAME = "uuidd-2.39.1-3.1.aarch64.rpm"
RPM_HASH = "cb17d67c2a791fbf5d8d8b9def03674d5e320300371f151ac78e126d20c937dfd6f746cb8a7c652a69323b1924329a42ec4b7d4084b4312811681e1079247a00"

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
