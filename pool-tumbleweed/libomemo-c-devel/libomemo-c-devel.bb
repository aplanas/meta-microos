SUMMARY = "Development files for libomemo-c"
DESCRIPTION = "Development files and headers for libomemo-c"
LICENSE = "GPL-3.0-only"

PV = "0.5.0"

RPM_NAME = "libomemo-c-devel-0.5.0-1.3.aarch64.rpm"
RPM_HASH = "f3208cd69dd9948ee0b2d1be1e01d270e0bd5a3fb239644b26fb943a1af824752e63d1d602332440398982e26b7ddd92c7909678b3b34c285382ca50b3b3a078"

RPROVIDES:${PN} += "libomemo-c-devel \
pkgconfig-libomemo-c"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libomemo-c0"

inherit rpm
