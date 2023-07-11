SUMMARY = "SCIM im module for gtk3"
DESCRIPTION = "This package contains SCIM im module for gtk3"
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.18"

RPM_NAME = "scim-gtk3-1.4.18-5.11.aarch64.rpm"
RPM_HASH = "f02b086e4ff1d7101ff08e6003460ec972b4795f76ef952d2674a69187b65107fbc034f83794eb58338fd0b152da882202c8a5a1bfb54f83f8cae086641a35ac"

RPROVIDES:${PN} += "scim-gtk3"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
scim"

inherit rpm
