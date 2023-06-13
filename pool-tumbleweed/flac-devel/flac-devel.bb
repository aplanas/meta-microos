SUMMARY = "FLAC Library Development Package"
DESCRIPTION = "This package contains the files needed to compile programs that use \
the FLAC library."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & GFDL-1.2-only"

PV = "1.4.2"

RPM_NAME = "flac-devel-1.4.2-2.3.aarch64.rpm"
RPM_HASH = "22b2bd50e18e4ba77f847afd55800bbb9bdc072e38decdac968781f8f007cf8757ba4d7d9d8680e1a8351a9ee3f924c48fc4829daf5a36611afe19286244f80c"

RPROVIDES:${PN} += "flac-devel \
flac-devel(aarch-64) \
pkgconfig(flac) \
pkgconfig(flac++)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libFLAC++10 \
libFLAC12 \
libstdc++-devel \
pkgconfig(flac) \
pkgconfig(ogg)"

inherit rpm
