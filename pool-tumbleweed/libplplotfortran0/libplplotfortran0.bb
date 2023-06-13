SUMMARY = "Shared libraries for PLplot's Fortran bindings"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the shared libraries necessary for using PLplot \
with Fortran."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "libplplotfortran0-5.15.0-16.2.aarch64.rpm"
RPM_HASH = "46c6604cc590351639f821e4672a6fd41773e6324a60a36ad5482f501bb71a0a49a9b9ef1e3dbb8269c9380c6ba1454da4572571cf3169f791f99f4de15d7341"

RPROVIDES:${PN} += "libplplotfortran.so.0()(64bit) \
libplplotfortran0 \
libplplotfortran0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_10)(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libplplot.so.17()(64bit)"

inherit rpm
