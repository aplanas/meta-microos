SUMMARY = "The standard C++ shared library"
DESCRIPTION = "The standard C++ library, needed for dynamically linked C++ programs."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.1.1+git7552"

RPM_NAME = "libstdc++6-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "b2f23b330ddbb42493196695b7f05d05e716bb16668fe6757218d04775ff1a382a73d57f90875b4e275ddedc7920773770c867c72ee656f8ccd1f876ddd448b4"

RPROVIDES:${PN} += "libstdc++.so.6 \
libstdc++6"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
