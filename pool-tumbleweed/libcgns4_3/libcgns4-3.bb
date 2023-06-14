SUMMARY = "CFD General Notation System library"
DESCRIPTION = "The CFD General Notation System (CGNS) provides a general, portable, \
and extensible standard for the storage and retrieval of computational \
fluid dynamics (CFD) analysis data."
LICENSE = "Zlib"

PV = "4.3.0"

RPM_NAME = "libcgns4_3-4.3.0-1.7.aarch64.rpm"
RPM_HASH = "f478afb3773b76d671668b3cc776cde129afd0839e15f04a20e349a81b0e89267b4aeaef4414d8d6becdf3afb55020afeb1035a0bb9aa8fecac8c44d9a414aaf"

RPROVIDES:${PN} += "libcgns \
libcgns.so.4.3 \
libcgns4-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5.so.200"

inherit rpm
