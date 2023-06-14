SUMMARY = "Liblazy - D-Bus methods provided for convenience"
DESCRIPTION = "Liblazy is a simple and easy to use library that provides convenient \
functions for sending messages over the D-Bus daemon, querying \
information from HAL or asking PolicyKit for a privilege."
LICENSE = "LGPL-2.1+"

PV = "0.2"

RPM_NAME = "liblazy-devel-0.2-1.25.aarch64.rpm"
RPM_HASH = "a882c7fe40fcccb56f10d8f9e168671389b46212554303b728caa422d0685945e9e4772faffdfd2e50a6ced4b71ea557d8246c7f3af94baad3827c2f06dafa10"

RPROVIDES:${PN} += "liblazy-devel \
pkgconfig-lazy"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
dbus-1-devel \
liblazy1 \
pkgconfig-dbus-1"

inherit rpm
