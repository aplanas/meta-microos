SUMMARY = "Development tools for dwayland"
DESCRIPTION = "The dwayland-devel package contains the header files and developer docs for \
dwayland."
LICENSE = "LGPL-2.1-or-later"

PV = "5.24.3"

RPM_NAME = "dwayland-devel-5.24.3-1.3.aarch64.rpm"
RPM_HASH = "c5d2c32eeabe5d25c4922eb6ed8639ec132cbffc8ed52956bc989b52dee770de056ffcbb0f6cce206aa7815a70527b5d18f6b3ff2f12c1b4660fc692f59dd103"

RPROVIDES:${PN} += "cmake(DWayland) \
dwayland-devel \
dwayland-devel(aarch-64)"
RDEPENDS:${PN} += "libDWaylandClient5 \
libDWaylandServer5"

inherit rpm
