SUMMARY = "A library that provides complex error functions"
DESCRIPTION = "libcerf is a self-contained numeric library that provides an efficient and \
accurate implementation of complex error functions, along with Dawson, \
Faddeeva, and Voigt functions."
LICENSE = "MIT"

PV = "2.3"

RPM_NAME = "libcerf2-2.3-1.1.aarch64.rpm"
RPM_HASH = "d583b782c7ffba64415bfdebf8bc2b88beef7a56bc7158b29bf3cad4aae1dd05d0bbf7fb52f2564d0068beb1f4b7bf6678d2fbf1977f699f6bb44c6fd225ffe4"

RPROVIDES:${PN} += "libcerf.so.2 \
libcerf2"

RDEPENDS:${PN} += "/sbin/ldconfig \
libm.so.6"

inherit rpm
