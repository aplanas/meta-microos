SUMMARY = "Development files for libsoc"
DESCRIPTION = "libsoc is a C library to interface with common peripherals found in System \
on Chips (SoC) through generic Linux Kernel interfaces. \
 \
This package contains development files for libsoc."
LICENSE = "LGPL-2.1-only"

PV = "0.8.2"

RPM_NAME = "libsoc-devel-0.8.2-3.14.aarch64.rpm"
RPM_HASH = "7bf37b063e0c58fbc3bb0f8ce49fb0722d15841f9d56e7a302f4cb6e6c8e2cd83f4589f8937a1d6a83a15343fdea819414bf63e09fda64c5f53dcc780439acb1"

RPROVIDES:${PN} += "libsoc-devel \
pkgconfig-libsoc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsoc2"

inherit rpm
