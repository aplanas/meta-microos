SUMMARY = "Dynamic libraries for Judy"
DESCRIPTION = "Judy is a C library that provides a state-of-the-art core technology that implements \
a sparse dynamic array. Judy arrays are declared simply with a null pointer. A Judy \
array consumes memory only when it is populated, yet can grow to take advantage \
of all available memory if desired. \
 \
Judy's key benefits are scalability, high performance, and memory efficiency. A Judy \
array is extensible and can scale up to a very large number of elements, bounded \
only by machine memory. Since Judy is designed as an unbounded array, the size of \
a Judy array is not pre-allocated but grows and shrinks dynamically \
with the array population."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.5"

RPM_NAME = "libJudy1-1.0.5-10.12.aarch64.rpm"
RPM_HASH = "2ed97de08839f92a951e6b5dacb4299e3ddaf303d70f0368652e7a28c0530c8a7feece28b4ca92821704d6263285e05a24d60e2b01f0a9f9a3e7b21a3e16903b"

RPROVIDES:${PN} += "libJudy.so.1()(64bit) \
libJudy1 \
libJudy1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
