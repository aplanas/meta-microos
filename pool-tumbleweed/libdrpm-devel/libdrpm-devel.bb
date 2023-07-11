SUMMARY = "C interface for the drpm library"
DESCRIPTION = "This package provides a C interface (drpm.h) for the drpm library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.5.1"

RPM_NAME = "libdrpm-devel-0.5.1-1.5.aarch64.rpm"
RPM_HASH = "6c8465630d88f3a0011a3a26c3bbe2db306a6d28c25d239deb1f53b746039efcf7542c4754557564bbdfccda83c51c9e259c65b1fd589dbd34d047f2fecc01b6"

RPROVIDES:${PN} += "drpm-devel \
libdrpm-devel \
pkgconfig-drpm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdrpm0"

inherit rpm
