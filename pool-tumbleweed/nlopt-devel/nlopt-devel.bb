SUMMARY = "Development files for nlopt"
DESCRIPTION = "The nlopt-devel package contains libraries and header files for \
developing applications that use NLopt."
LICENSE = "LGPL-2.0-only"

PV = "2.7.1"

RPM_NAME = "nlopt-devel-2.7.1-3.7.aarch64.rpm"
RPM_HASH = "41c650439a6cc5038aebc55115d2193dbc8d6fcc4b153df73d9fbf1c6ed521630a51ea41115eb3ea2749b497a5063fc669bba808af85a9c1738a6500f4808875"

RPROVIDES:${PN} += "cmake(NLopt) \
nlopt-devel \
nlopt-devel(aarch-64) \
pkgconfig(nlopt)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnlopt0"

inherit rpm
