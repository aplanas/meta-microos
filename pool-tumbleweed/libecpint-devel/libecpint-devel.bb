SUMMARY = "Devel package for libecpint"
DESCRIPTION = "Libecpint is a C++ library for the efficient evaluation of integrals over ab \
initio effective core potentials, using a mixture of generated, recursive \
code and Gauss-Chebyshev quadrature. It is designed to be standalone and \
generic. \
This package contains development headers and libraries for libecpint"
LICENSE = "MIT"

PV = "1.0.7"

RPM_NAME = "libecpint-devel-1.0.7-2.11.aarch64.rpm"
RPM_HASH = "3e661a80f921c710671c64d80040d53f1eed32b4a4487862c7ccd7d8aa6c867b9c9fe221481b008b9e81782dd085715d4c5b1ff7954a3e32ed39e272d27f9aaa"

RPROVIDES:${PN} += "cmake-ecpint \
libecpint-devel"

RDEPENDS:${PN} += "libcerf-devel \
libecpint1"

inherit rpm
