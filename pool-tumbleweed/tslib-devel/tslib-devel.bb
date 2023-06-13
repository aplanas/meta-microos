SUMMARY = "Development files for tslib, a touchscreen panel event layer"
DESCRIPTION = "Devel package for tslib. Tslib is an abstraction layer for touchscreen panel events."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-only"

PV = "1.22"

RPM_NAME = "tslib-devel-1.22-1.9.aarch64.rpm"
RPM_HASH = "0e9925dac806ffc4c0040e65189139e7153ed2fc23ccd056e6003ef8e5582df9565044a032e9a7fa82a9df95c343a2a0e8b35cbb5ffe0f7baa2e6eb0788bc465"

RPROVIDES:${PN} += "pkgconfig(tslib) \
tslib-devel \
tslib-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
tslib \
tslib-plugins"

inherit rpm
