SUMMARY = "Development files for cups-filters"
DESCRIPTION = "This package contains the development files for cups-filters."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & MIT"

PV = "1.28.15"

RPM_NAME = "cups-filters-devel-1.28.15-2.3.aarch64.rpm"
RPM_HASH = "c4730aa127a10f64db53e95db98667daae968411276608f5d524f83b244df7f38c6e1267e5ed496291d755f2cf2eb2029e651ccc4417086f084e98e444c01dcf"

RPROVIDES:${PN} += "cups-filters-devel cups-filters-devel(aarch-64) pkgconfig(libcupsfilters) pkgconfig(libfontembed)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cups-filters"

inherit rpm
