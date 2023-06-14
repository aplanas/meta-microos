SUMMARY = "Headers and source files for building against LALSimulation"
DESCRIPTION = "This package provides the header and sources for coding against LALSimulation."
LICENSE = "GPL-2.0-only"

PV = "4.0.0"

RPM_NAME = "lalsimulation-devel-4.0.0-2.1.aarch64.rpm"
RPM_HASH = "77c1791cb5d86255e13a3912f227eed04c56c84246225fe63dfd5a6454c26d4ed9d680bf7cb841ae8f53fc9ecabc7db9eaf8bab6e53bf8dd938989f5d25150df"

RPROVIDES:${PN} += "config-lalsimulation-devel \
lalsimulation-devel \
pkgconfig-lalsimulation"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
lalsimulation-data \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgsl.so.25 \
liblal.so.20 \
liblalsimulation.so.31 \
liblalsimulation31 \
liblalsupport.so.14 \
libm.so.6 \
pkgconfig-gsl \
pkgconfig-lal \
pkgconfig-zlib"

inherit rpm
