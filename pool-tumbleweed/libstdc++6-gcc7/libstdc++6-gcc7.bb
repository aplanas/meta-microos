SUMMARY = "The standard C++ shared library"
DESCRIPTION = "The standard C++ library, needed for dynamically linked C++ programs."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "7.5.0+r278197"

RPM_NAME = "libstdc++6-gcc7-7.5.0+r278197-14.6.aarch64.rpm"
RPM_HASH = "6e233e49b885132e8ecfb2c9be7a59ab8198f4286a06d41d71b5ccbdc24a790b886a40831db2397fe65c0f61f1b0b8478537875a65f1c83e331ec6345cd3e5da"

RPROVIDES:${PN} += "libstdc++.so.6 \
libstdc++6 \
libstdc++6-gcc7"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
