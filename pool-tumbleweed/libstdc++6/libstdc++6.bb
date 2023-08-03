SUMMARY = "The standard C++ shared library"
DESCRIPTION = "The standard C++ library, needed for dynamically linked C++ programs."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.1.1+git7597"

RPM_NAME = "libstdc++6-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "bfcd5b338c9aea5eaafebfcda076befdf89addeca20772df52514e878845cc0e6ed411cf221a9c1d09b9880a404e24288b58bc986d7f392ceaf8cffe9588dc07"

RPROVIDES:${PN} += "libstdc++.so.6 \
libstdc++6"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
