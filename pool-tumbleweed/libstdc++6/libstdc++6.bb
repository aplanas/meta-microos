SUMMARY = "The standard C++ shared library"
DESCRIPTION = "The standard C++ library, needed for dynamically linked C++ programs."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.2.1+git7683"

RPM_NAME = "libstdc++6-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "74efd241a33b305746edbce65ba791ca4b0b0f56b3832e0b1debfc784a47363d04a5de8b4e941aef311c14c7480b9574f876c81195eee36069a3565915d71f03"

RPROVIDES:${PN} += "libstdc++.so.6 \
libstdc++6"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
