SUMMARY = "Fast Fourier Transform library"
DESCRIPTION = "A Fast Fourier Transform based up on the principle, 'Keep It Simple, Stupid'. \
Kiss FFT is a very small, reasonably efficient, mixed radix FFT library that \
can use either fixed or floating point data types."
LICENSE = "BSD-3-Clause & Unlicense"

PV = "131.1.0"

RPM_NAME = "kissfft-131.1.0-2.3.aarch64.rpm"
RPM_HASH = "383040af7b565b789c108f536d7a4eea04a6e389afd9d206a037cf24141042820182e4a8bc1dba166aa4654e0daae20e1294679a5dc9df803af867316dfa48c2"

RPROVIDES:${PN} += "kissfft"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkissfft-float.so.131 \
libm.so.6 \
libpng16.so.16"

inherit rpm
