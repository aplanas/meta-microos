SUMMARY = "Development headers for the M-bus Library"
DESCRIPTION = "libmbus is an open source library for the M-bus (Meter-Bus) protocol. \
 \
This package allows you to write programs against libmbus."
LICENSE = "BSD-3-Clause"

PV = "0.9.0+59"

RPM_NAME = "libmbus-devel-0.9.0+59-1.4.aarch64.rpm"
RPM_HASH = "bd978421214921239ca8e78c22eaef34efaf94b24b23d9dbabd1d63bd1b6f575feb777f610e92643d1302222e01410e92c0c571ff0c676a89e8514c7a590e50e"

RPROVIDES:${PN} += "libmbus-devel \
pkgconfig-libmbus"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmbus0"

inherit rpm
