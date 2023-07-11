SUMMARY = "Liblazy - D-Bus methods provided for convenience"
DESCRIPTION = "Liblazy is a simple and easy to use library that provides convenient \
functions for sending messages over the D-Bus daemon, querying \
information from HAL or asking PolicyKit for a privilege."
LICENSE = "LGPL-2.1+"

PV = "0.2"

RPM_NAME = "liblazy-devel-0.2-1.26.aarch64.rpm"
RPM_HASH = "93f26e9feacd92857062c8427c3bde46197ee5c9d6a5da9862602d3907c8f76bf11a1dd6742027b22057d8af357702aa48967b9e1fcc15d546bc955a8a745798"

RPROVIDES:${PN} += "liblazy-devel \
pkgconfig-lazy"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
dbus-1-devel \
liblazy1 \
pkgconfig-dbus-1"

inherit rpm
