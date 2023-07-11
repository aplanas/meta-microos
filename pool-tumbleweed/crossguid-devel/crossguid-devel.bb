SUMMARY = "Development files for libcrossguid"
DESCRIPTION = "The crossguid-devel package contains libraries and header files for \
developing applications that use libcrossguid."
LICENSE = "MIT"

PV = "0.2.2.20190529T083634.ca1bf4b"

RPM_NAME = "crossguid-devel-0.2.2.20190529T083634.ca1bf4b-2.2.aarch64.rpm"
RPM_HASH = "131fbc47f9f3fab39a74fdf8c93856ddb651e45f28182ff503231ae530e68d1a42c9d79ed929cf6cee589a09806212cc77c7864866d0753225e01877e046d2b6"

RPROVIDES:${PN} += "crossguid-devel \
pkgconfig-crossguid"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcrossguid0"

inherit rpm
