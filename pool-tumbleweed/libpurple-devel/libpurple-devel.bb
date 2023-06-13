SUMMARY = "Development Headers, Documentation, and Libraries for libpurple"
DESCRIPTION = "The libpurple-devel package contains the header files, developer \
documentation, and libraries required for development of libpurple \
based instant messaging clients or plugins for any libpurple based \
client."
LICENSE = "GPL-2.0-only"

PV = "2.14.12"

RPM_NAME = "libpurple-devel-2.14.12-1.3.aarch64.rpm"
RPM_HASH = "8350089e49d43d3206f2b96daeeb141e714de2908201d7794a3c55ff068b2791b4aef8ea368a790d5806a7f14a19f380f223175acb69666e8f3c03bd21fceec3"

RPROVIDES:${PN} += "libpurple-devel \
libpurple-devel(aarch-64) \
pkgconfig(purple)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpurple \
pkgconfig(glib-2.0) \
pkgconfig(libxml-2.0)"

inherit rpm
