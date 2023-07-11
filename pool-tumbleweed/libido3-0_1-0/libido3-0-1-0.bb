SUMMARY = "Shared library providing extra GTK+ menu items in system indicators"
DESCRIPTION = "Shared library providing extra GTK+ menu items for display in \
system indicators. \
 \
This package contains shared libraries."
LICENSE = "GPL-3.0-only & LGPL-3.0-only & LGPL-2.1-only"

PV = "13.10.0+bzr20161028"

RPM_NAME = "libido3-0_1-0-13.10.0+bzr20161028-3.17.aarch64.rpm"
RPM_HASH = "06a0b22192f97cdf32e3f638d35cb2a6b62c6b2330cdaf904cf5027d9c5260e14ff1ee49c2139d28b05d6b31e1fb7500de5950ed1d5012d1c997a3912d6342c6"

RPROVIDES:${PN} += "libido3-0-1-0 \
libido3-0.1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
