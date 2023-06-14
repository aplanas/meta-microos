SUMMARY = "Development files for LAL Burst"
DESCRIPTION = "This package contains sources and header files needed to build applications \
that use the LAL Burst library."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.0"

RPM_NAME = "lalburst-devel-1.6.0-1.2.aarch64.rpm"
RPM_HASH = "3c6045233408195f5cafa6654fe6bd3af9e0beee04f31b78d6aee4e74a0f61d4819f0559b4d1a16dc0634cf273d198b19f7a1bb62430fa03fce2d3f2d4e791c7"

RPROVIDES:${PN} += "config-lalburst-devel \
lalburst-devel \
pkgconfig-lalburst"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3.10 \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblal.so.20 \
liblalburst.so.6 \
liblalburst6 \
pkgconfig-gsl \
pkgconfig-lal \
pkgconfig-lalmetaio \
pkgconfig-lalsimulation \
pkgconfig-libmetaio"

inherit rpm
