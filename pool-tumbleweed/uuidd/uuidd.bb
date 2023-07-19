SUMMARY = "Helper daemon to guarantee uniqueness of time-based UUIDs"
DESCRIPTION = "The uuidd package contains a userspace daemon (uuidd) which guarantees \
uniqueness of time-based UUID generation even at very high rates on \
SMP systems."
LICENSE = "GPL-2.0-or-later"

PV = "2.39"

RPM_NAME = "uuidd-2.39-3.1.aarch64.rpm"
RPM_HASH = "2ae2085601657130d0a32f19490cca679a5d8908deb042376572855c6e5e90c4f85605db015eb9e9af197176129013a3221afb672a8a24a5de53ccc20346c10d"

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
