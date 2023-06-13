SUMMARY = "PLplot driver using the cairo backend"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the cairo driver for plotting using PLplot."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "plplot-driver-cairo-5.15.0-16.2.aarch64.rpm"
RPM_HASH = "5739c0f4b7fd0f208b070d443e1d57e53422c74324906749107031bee83ebd4b377a70976192febdfa843a12608d4d2a6ad7c3ee008c0cd61351f0898de5d910"

RPROVIDES:${PN} += "plplot-driver-cairo \
plplot-driver-cairo(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcairo.so.2()(64bit) \
libgobject-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libplplot.so.17()(64bit) \
plplot-common"

inherit rpm
