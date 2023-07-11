SUMMARY = "An alternate Linux/POSIX capabilities library"
DESCRIPTION = "libcap-ng is a library providing an alternate mechanism to libcap to \
inspect and set Linux process and file capabilities (modeled upon a \
withdrawn POSIX.1e draft)."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.3"

RPM_NAME = "libcap-ng0-0.8.3-2.3.aarch64.rpm"
RPM_HASH = "e5e53f4de75cc76e8975ecc82a306f1753efecbff70f60ed1445efbb80eda5174257bba4ce1b7f71e373cd8f5e7943d32fee92d49a323e6d7d333cb2c2524c1e"

RPROVIDES:${PN} += "libcap-ng.so.0 \
libcap-ng0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
