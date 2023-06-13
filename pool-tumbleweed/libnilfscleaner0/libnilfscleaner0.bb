SUMMARY = "Cleaner library for interacting with nilfs"
DESCRIPTION = "This package contains shared cleaner library needed for some applications \
to interface with nilfs"
LICENSE = "GPL-2.0-only"

PV = "2.2.9"

RPM_NAME = "libnilfscleaner0-2.2.9-1.4.aarch64.rpm"
RPM_HASH = "31b588929de8c8a3304ffdc042de2446886804055845e1c49c8a1da2043896c2e790dd238fdc89ae9b592c7a047ff9612cfdfcacf233c529122122e61b5f14bf"

RPROVIDES:${PN} += "libnilfscleaner.so.0()(64bit) \
libnilfscleaner0 \
libnilfscleaner0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libuuid.so.1()(64bit)"

inherit rpm
