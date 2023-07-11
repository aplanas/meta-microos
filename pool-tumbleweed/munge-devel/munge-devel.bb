SUMMARY = "Headers and Libraries for building applications using munge"
DESCRIPTION = "A header file and libraries for building applications using the munge \
authenication service."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "0.5.15"

RPM_NAME = "munge-devel-0.5.15-2.5.aarch64.rpm"
RPM_HASH = "1f3e6710dfeaf271a5149b3e8a1e31a61c7224bd6954bd73a22d3ee658a89ad56542ef530f2f46e274f89967a9141ffac7877a4d36f2c8fc7713fa1142387a92"

RPROVIDES:${PN} += "munge-devel \
pkgconfig-munge"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmunge2"

inherit rpm
