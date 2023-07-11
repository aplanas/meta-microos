SUMMARY = "Headers and source files for developing with ldas-tools-framecpp"
DESCRIPTION = "This package provides the headers and sources needed for developing programs \
using ldas-tools-framecpp - a toolkit providing C++ bindings for libframe."
LICENSE = "GPL-2.0-or-later"

PV = "2.7.0"

RPM_NAME = "ldas-tools-framecpp-devel-2.7.0-2.13.aarch64.rpm"
RPM_HASH = "53e39d81f0df55f1a3bc11a9afa1e763e9bbd37484b36dce6ab9a5e6706b15c4871184a3478ab908a83cdc77422c672a7ec5b1d08c07721b84cd0075fa1c84ed"

RPROVIDES:${PN} += "ldas-tools-framecpp-devel \
pkgconfig-framecpp \
pkgconfig-framecpp-common \
pkgconfig-framecpp3 \
pkgconfig-framecpp4 \
pkgconfig-framecpp6 \
pkgconfig-framecpp7 \
pkgconfig-framecpp8"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libboost-program-options-devel \
libframecpp12 \
libframecpp3-6 \
libframecpp4-8 \
libframecpp6-8 \
libframecpp7-4 \
libframecpp8-7 \
libframecppc3 \
libframecppcmn11 \
pkgconfig-ldastoolsal \
pkgconfig-openssl \
pkgconfig-zlib"

inherit rpm
