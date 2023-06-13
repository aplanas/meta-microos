SUMMARY = "PLplot driver using the ntk backend"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the ntk driver for plotting using PLplot."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "plplot-driver-ntk-5.15.0-16.2.aarch64.rpm"
RPM_HASH = "137c9d9905e25b9145f20d7f45917d7a59c5bdf8480a2844d051f0a66bdcf43fcc9e73744a9351e4ee752e600afcb570a4d853e878a9a87ab4a917bc7e8cccd5"

RPROVIDES:${PN} += "plplot-driver-ntk \
plplot-driver-ntk(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libplplot.so.17()(64bit) \
libtcl8.6.so()(64bit) \
libtk8.6.so()(64bit) \
plplot-common"

inherit rpm
