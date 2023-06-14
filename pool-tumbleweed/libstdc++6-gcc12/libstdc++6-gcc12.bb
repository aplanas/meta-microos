SUMMARY = "The standard C++ shared library"
DESCRIPTION = "The standard C++ library, needed for dynamically linked C++ programs."
LICENSE = "GPL-3.0-or-later-WITH-GCC-exception-3.1"

PV = "12.3.0+git1204"

RPM_NAME = "libstdc++6-gcc12-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "9d7f1ca7f70b33249d2f1a5e26422b972529827390eb99c033cd8610302b56a0e6e5658ff404e7e891403e2af9f64367948e14c7593d4eec70eb6c750554a6d1"

RPROVIDES:${PN} += "libstdc++.so.6 \
libstdc++6 \
libstdc++6-gcc12"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
