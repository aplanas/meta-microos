SUMMARY = "Shared library for libportal"
DESCRIPTION = "A GIO-style async APIs for most Flatpak portals. \
This package contains the shared library of libportal."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6"

RPM_NAME = "libportal-1-0.6-1.8.aarch64.rpm"
RPM_HASH = "9e7d9b6fe3aded07cc129b9ccdf22c09606d6aae461f118ec8023396ebfb09378ae13fcbd7b17edcefa9cdc7b396bf1c1a4ccd9abc3844db4014ba45a3168191"

RPROVIDES:${PN} += "libportal-1 \
libportal.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
