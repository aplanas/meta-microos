SUMMARY = "A library that provides complex error functions"
DESCRIPTION = "libcerf is a self-contained numeric library that provides an efficient and \
accurate implementation of complex error functions, along with Dawson, \
Faddeeva, and Voigt functions."
LICENSE = "MIT"

PV = "2.2"

RPM_NAME = "libcerf2-2.2-1.3.aarch64.rpm"
RPM_HASH = "c92ae2092b4497653481e0221d407d5103e47f6c06efa1f88eff97c3f7356d23a19d7afb08cf3c9a3d95837615687c82ce4bf74bffb6fe7e0a33391891026987"

RPROVIDES:${PN} += "libcerf.so.2 \
libcerf2"

RDEPENDS:${PN} += "/sbin/ldconfig \
libm.so.6"

inherit rpm
