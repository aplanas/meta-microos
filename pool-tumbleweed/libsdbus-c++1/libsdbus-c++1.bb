SUMMARY = "Shared library for sdbus-cpp"
DESCRIPTION = "Shared library files for sdbus-cpp."
LICENSE = "LGPL-2.1-only"

PV = "1.2.0"

RPM_NAME = "libsdbus-c++1-1.2.0-1.6.aarch64.rpm"
RPM_HASH = "b8a56a3127db8fe6578455269f203a7b6878edaa55140285815fae25c10600a859fe5a3b6c1fb0689acb9c7a6682c679f0efd993aaaf05ec9dba89eef0610d95"

RPROVIDES:${PN} += "libsdbus-c++.so.1 \
libsdbus-c++1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libsystemd.so.0"

inherit rpm
