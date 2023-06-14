SUMMARY = "Shared library for sdbus-cpp"
DESCRIPTION = "Shared library files for sdbus-cpp."
LICENSE = "LGPL-2.1-only"

PV = "1.2.0"

RPM_NAME = "libsdbus-c++1-1.2.0-1.5.aarch64.rpm"
RPM_HASH = "d194b6c4ff0c444904684d25ba4faea3de7a69edbe154e3b558b5257f7cfb7bc87dee44869468ce08d4885f8bb6ee6c11f2c6039bcd6c3f4c05a911cf8b5ead4"

RPROVIDES:${PN} += "libsdbus-c++.so.1 \
libsdbus-c++1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libsystemd.so.0"

inherit rpm
