SUMMARY = "Non-linear curve fitting and data analysis, command line interface"
DESCRIPTION = "Fityk is a program for nonlinear curve-fitting of analytical \
functions (especially peak-shaped) to data (usually experimental \
data). It can also be used for visualization of x-y data only. \
 \
This package contains command line interface for Fityk."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "cfityk-1.3.2-1.4.aarch64.rpm"
RPM_HASH = "c3baa97dd8bf9347413f9b87cdf5fb8288654180fcfbd399eed2fe804a0a91bb78a57a39568670a4d60d575a67b8e6808a1c0b14bd18483e7a5842f04964e5bc"

RPROVIDES:${PN} += "cfityk \
cfityk(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libfityk.so.4()(64bit) \
libgcc_s.so.1()(64bit) \
libreadline.so.8()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
