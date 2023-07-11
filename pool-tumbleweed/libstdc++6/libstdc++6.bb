SUMMARY = "The standard C++ shared library"
DESCRIPTION = "The standard C++ library, needed for dynamically linked C++ programs."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.1.1+git7364"

RPM_NAME = "libstdc++6-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "856a1c6881e7dc16bb1e91529dd371e3e63a3738fc441e8c980afb44bfe845d61bd43b29a0a7c4b117a97386c11a468850685d4185353b64ae3bf8a5faf4f93d"

RPROVIDES:${PN} += "libstdc++.so.6 \
libstdc++6"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
