SUMMARY = "Library for password quality checking and generating random passwords"
DESCRIPTION = "libpwquality is a library for password quality checks and generation \
of random passwords that pass the checks."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later"

PV = "1.4.5"

RPM_NAME = "libpwquality1-1.4.5-1.3.aarch64.rpm"
RPM_HASH = "9ce82f17b84e95ff01602063161e4c01486bdd6535ec991eb715601a7c15034d6ac4a6af8e15686dcb73094fe1b5f2d43dff87ea211dc65e06f49357e6170e2b"

RPROVIDES:${PN} += "config-libpwquality1 \
libpwquality \
libpwquality.so.1 \
libpwquality1"

RDEPENDS:${PN} += "/sbin/ldconfig \
cracklib-dict \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrack.so.2"

inherit rpm
