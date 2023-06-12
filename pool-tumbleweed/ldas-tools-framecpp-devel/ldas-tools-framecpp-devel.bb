SUMMARY = "Headers and source files for developing with ldas-tools-framecpp"
DESCRIPTION = "This package provides the headers and sources needed for developing programs \
using ldas-tools-framecpp - a toolkit providing C++ bindings for libframe."
LICENSE = "GPL-2.0-or-later"

PV = "2.7.0"

RPM_NAME = "ldas-tools-framecpp-devel-2.7.0-2.12.aarch64.rpm"
RPM_HASH = "960a90245a5a1fb818909b0acbc77f48b499a770b85c8edeec6cf2b4f7872c97dc13e5eae58416371bac0cddb191a316b9812656a34beedea7e35a8085fa8dae"

RPROVIDES:${PN} += "ldas-tools-framecpp-devel \
ldas-tools-framecpp-devel(aarch-64) \
pkgconfig(framecpp) \
pkgconfig(framecpp3) \
pkgconfig(framecpp4) \
pkgconfig(framecpp6) \
pkgconfig(framecpp7) \
pkgconfig(framecpp8) \
pkgconfig(framecpp_common)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libboost_program_options-devel \
libframecpp12 \
libframecpp3-6 \
libframecpp4-8 \
libframecpp6-8 \
libframecpp7-4 \
libframecpp8-7 \
libframecppc3 \
libframecppcmn11 \
pkgconfig(ldastoolsal) \
pkgconfig(openssl) \
pkgconfig(zlib)"

inherit rpm
