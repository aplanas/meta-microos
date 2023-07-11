SUMMARY = "C library for interacting with the linux GPIO character device"
DESCRIPTION = "The libgpiod library encapsulates the ioctl calls and data structures \
of the GPIO character devices, the latter of which superseded the \
GPIO sysfs interface in Linux 4.8. \
 \
C library part."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.3"

RPM_NAME = "libgpiod2-1.6.3-2.4.aarch64.rpm"
RPM_HASH = "036d7c0ade7b1ade13c7373980bb47db05ac8494a6af30864e2711d0c6d9515678732b4ecc7adcd9c1e272ef3a59775430f84596c02b0ea07029f67a6b3af602"

RPROVIDES:${PN} += "libgpiod.so.2 \
libgpiod2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
