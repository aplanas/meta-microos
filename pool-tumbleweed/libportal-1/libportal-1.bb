SUMMARY = "Shared library for libportal"
DESCRIPTION = "A GIO-style async APIs for most Flatpak portals. \
This package contains the shared library of libportal."
LICENSE = "LGPL-3.0-or-later"

PV = "0.7"

RPM_NAME = "libportal-1-0.7-1.1.aarch64.rpm"
RPM_HASH = "394ec46ced3cbabc4d112910d0d11ae9e176e90be8d2c210188adc02c0717ce1e5350a3517e314a75e5c8784108c83a2746fd1f8c64b9182d257c8f871ba7bfe"

RPROVIDES:${PN} += "libportal-1 \
libportal.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
