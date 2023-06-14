SUMMARY = "Development files for libivykis, an event dispatching library"
DESCRIPTION = "libivykis is a thin wrapper over various OS'es implementation of I/O \
readiness notification facilities (such as poll(2), kqueue(2)) and is \
mainly intended for writing portable high-performance network \
servers. \
 \
This package contains the header files and development symlinks."
LICENSE = "LGPL-2.1-only"

PV = "0.42.4"

RPM_NAME = "ivykis-devel-0.42.4-1.9.aarch64.rpm"
RPM_HASH = "d5c6054d5f6d54750a1616d243e26afb7e5e2a7648cbbe2d74e09a1201dc3dbab06c5597b2af452e5174243381d8884a15cd8d90118d5c46fa11b4c97a7d3fe6"

RPROVIDES:${PN} += "ivykis-devel \
pkgconfig-ivykis"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libivykis0"

inherit rpm
