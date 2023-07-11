SUMMARY = "Fast Fourier Transform library"
DESCRIPTION = "A Fast Fourier Transform based up on the principle, 'Keep It Simple, Stupid'. \
Kiss FFT is a very small, reasonably efficient, mixed radix FFT library that \
can use either fixed or floating point data types."
LICENSE = "BSD-3-Clause & Unlicense"

PV = "131.1.0"

RPM_NAME = "kissfft-devel-131.1.0-2.4.aarch64.rpm"
RPM_HASH = "198c7513189c9ca83aa36a97a399500591d8f69bda02f200badf52ed7f3f8ffaf6b320aa79ae2e337ebbef7aeb52a0d83d06120e024a012d08aa49ddfbea6a67"

RPROVIDES:${PN} += "cmake-kissfft \
kissfft-devel \
pkgconfig-kissfft-float"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libkissfft-float131"

inherit rpm
