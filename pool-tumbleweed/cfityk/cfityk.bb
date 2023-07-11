SUMMARY = "Non-linear curve fitting and data analysis, command line interface"
DESCRIPTION = "Fityk is a program for nonlinear curve-fitting of analytical \
functions (especially peak-shaped) to data (usually experimental \
data). It can also be used for visualization of x-y data only. \
 \
This package contains command line interface for Fityk."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "cfityk-1.3.2-1.5.aarch64.rpm"
RPM_HASH = "e19ce679c89286d579866a77e0b712a3a743994c57f716ddac16c52fac708441adfd9658e2538dc591190f4abb4a2f07f0c91e6c5a7513ad73410603555fcf94"

RPROVIDES:${PN} += "cfityk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfityk.so.4 \
libgcc-s.so.1 \
libreadline.so.8 \
libstdc++.so.6"

inherit rpm
