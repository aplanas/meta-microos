SUMMARY = "Development files for c-toxcore"
DESCRIPTION = "Development libraries and headers needed to build software using c-toxcore."
LICENSE = "GPL-3.0-only"

PV = "0.2.18"

RPM_NAME = "c-toxcore-devel-0.2.18-1.5.aarch64.rpm"
RPM_HASH = "950e14753f4023fd83857a508fc92164242180e909e9d1af4399c5d9cac52400acbde6d9b5c1dd174545ebe33df3e72f1201f11cc39e945e991176cbe0075589"

RPROVIDES:${PN} += "c-toxcore-devel \
pkgconfig-toxcore"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
c-toxcore \
libtoxcore2 \
pkgconfig-libsodium \
pkgconfig-opus \
pkgconfig-vpx"

inherit rpm
