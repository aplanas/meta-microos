SUMMARY = "The standard C++ shared library"
DESCRIPTION = "The standard C++ library, needed for dynamically linked C++ programs."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.2.1+git7683"

RPM_NAME = "libstdc++6-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "07719e87191ff7cbee42ba6b749ee0021dffa110f4136dfa383b3c8d9601a4919253b46da2ab7605a1cf7b491bdc62d26ef7d3ef17caf23cb39b1a7a737f76c1"

RPROVIDES:${PN} += "libstdc++.so.6 \
libstdc++6"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
