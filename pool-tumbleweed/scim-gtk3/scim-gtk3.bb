SUMMARY = "SCIM im module for gtk3"
DESCRIPTION = "This package contains SCIM im module for gtk3"
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.18"

RPM_NAME = "scim-gtk3-1.4.18-5.10.aarch64.rpm"
RPM_HASH = "f3061de87c28a75ba592162dd015ee3deaaa32c43c70c22edcab7eff4c7c4669f9ee03819fbd55eca1284677f3113638d2bd21b447632438df8fed53d120fa3c"

RPROVIDES:${PN} += "scim-gtk3"

RDEPENDS:${PN} += "/bin/sh \
gtk3-tools \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
scim"

inherit rpm
