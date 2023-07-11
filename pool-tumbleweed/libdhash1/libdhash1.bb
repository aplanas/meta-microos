SUMMARY = "Dynamic hash table library"
DESCRIPTION = "A hash table which will dynamically resize to achieve optimal storage & access \
time properties"
LICENSE = "LGPL-3.0-or-later"

PV = "0.5.0"

RPM_NAME = "libdhash1-0.5.0-28.1.aarch64.rpm"
RPM_HASH = "6149336b8ff0a8b06d8903d658e6e830387e4fe264d4bdab2f57dc24d6a2d9bcbe51e577248db0a378f1b2ccfc2277496c9759345e2d5e15fc8817ed49b5c7f3"

RPROVIDES:${PN} += "libdhash.so.1 \
libdhash1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
