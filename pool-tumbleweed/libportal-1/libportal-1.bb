SUMMARY = "Shared library for libportal"
DESCRIPTION = "A GIO-style async APIs for most Flatpak portals. \
This package contains the shared library of libportal."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6"

RPM_NAME = "libportal-1-0.6-1.7.aarch64.rpm"
RPM_HASH = "57c2d2e6e6fff18e00312d60c739d4d52870c2e0ad1df9d48290bb161fef082b970e83da400424507724b0a87d150ab4d0bf39c4731502e08f02e2ad6f5c9fe6"

RPROVIDES:${PN} += "libportal-1 \
libportal.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
