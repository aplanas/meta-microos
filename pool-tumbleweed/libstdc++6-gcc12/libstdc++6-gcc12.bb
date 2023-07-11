SUMMARY = "The standard C++ shared library"
DESCRIPTION = "The standard C++ library, needed for dynamically linked C++ programs."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "12.3.0+git1204"

RPM_NAME = "libstdc++6-gcc12-12.3.0+git1204-1.33.aarch64.rpm"
RPM_HASH = "e775d0907a2243b8d17c26583fcd6f4e62eca59956c5e04d4282a8bd326b10d99630e18a07863d25c2c8249612972fe45d3d53f354cb95ade2bc26b858b4e769"

RPROVIDES:${PN} += "libstdc++.so.6 \
libstdc++6 \
libstdc++6-gcc12"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
