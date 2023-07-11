SUMMARY = "GNU m4"
DESCRIPTION = "GNU m4 is an implementation of the traditional Unix macro processor."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.18"

RPM_NAME = "m4-1.4.18-7.6.aarch64.rpm"
RPM_HASH = "204ac370356ababfc94e7f1ba0d3eba56e1911f6520aa6e5e788a4513fa17f41d786472011909f3db0d2120cda2bf2328f84f6aa6cb7c1f3532d2c3add04e3da"

RPROVIDES:${PN} += "base-/usr/bin/m4 \
m4"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
