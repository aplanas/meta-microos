SUMMARY = "Read and write numerical arrays"
DESCRIPTION = "Library for compressed numerical arrays that support high \
throughput read and write random access. \
 \
This subpackage contains the implementation as a shared library."
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "libzfp1-1.0.0-1.3.aarch64.rpm"
RPM_HASH = "2b2205072d69a8b4e00168d1cdd493fc26d094bb4421236bc5680a4f89737f845f09a5a7a6a8dc9655e15f7d2e7b89b119ebcfe03c32978178f91fb8a76eeb5d"

RPROVIDES:${PN} += "libzfp.so.1()(64bit) \
libzfp1 \
libzfp1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgomp.so.1()(64bit) \
libm.so.6()(64bit)"

inherit rpm
