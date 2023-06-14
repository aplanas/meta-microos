SUMMARY = "Helper daemon to guarantee uniqueness of time-based UUIDs"
DESCRIPTION = "The uuidd package contains a userspace daemon (uuidd) which guarantees \
uniqueness of time-based UUID generation even at very high rates on \
SMP systems."
LICENSE = "GPL-2.0-or-later"

PV = "2.38.1"

RPM_NAME = "uuidd-2.38.1-13.1.aarch64.rpm"
RPM_HASH = "bbef3840ab535486c693dc3bcbfb569153761eaacc2ad8dc3914789c9bbd132c23954d5c48c2e94a23fde17825482426e1933ef36c800c520e5bab04f2e00d9a"

RPROVIDES:${PN} += "uuid-runtime \
uuidd"

RDEPENDS:${PN} += "/bin/sh \
group-uuidd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd.so.0 \
libuuid--uuid-generate-time-cont \
libuuid.so.1 \
systemd \
user-uuidd"

inherit rpm
