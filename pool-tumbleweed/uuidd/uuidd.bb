SUMMARY = "Helper daemon to guarantee uniqueness of time-based UUIDs"
DESCRIPTION = "The uuidd package contains a userspace daemon (uuidd) which guarantees \
uniqueness of time-based UUID generation even at very high rates on \
SMP systems."
LICENSE = "GPL-2.0-or-later"

PV = "2.39"

RPM_NAME = "uuidd-2.39-1.1.aarch64.rpm"
RPM_HASH = "1f6a0bf42eba17c646205f29dce2017e96c3da5b3e92c2d263a49c1b3803675a715eca1b9b970d14bffe294e0beb77002df60e7f582121044b38a1be1d1c2093"

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
