SUMMARY = "Development files for libupnpp"
DESCRIPTION = "The libupnpp-devel package contains libraries and header files for \
developing applications that use libupnpp."
LICENSE = "GPL-2.0-or-later"

PV = "0.22.2"

RPM_NAME = "libupnpp-devel-0.22.2-1.4.aarch64.rpm"
RPM_HASH = "03017d3b98d985e86e04e30d6e5a044ffeb9f45c876a03341485fa06a28e4d40f1d4555a1a8a65e2a6441924a037cad95f55f28b683fc58bd985f82373606155"

RPROVIDES:${PN} += "libupnpp-devel \
pkgconfig-libupnpp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libupnpp12 \
pkgconfig-libcurl"

inherit rpm
