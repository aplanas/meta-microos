SUMMARY = "Shared libraries for HepMC"
DESCRIPTION = "The HepMC package is an object oriented event record written in C++ \
for High Energy Physics Monte Carlo Generators. Many extensions from \
HEPEVT, the Fortran HEP standard, are supported: the number of entries \
is unlimited, spin density matrices can be stored with each vertex, \
flow patterns (such as color) can be stored and traced, integers \
representing random number generator states can be stored, and an \
arbitrary number of event weights can be included. Particles and \
vertices are kept separate in a graph structure, physically similar to \
a physics event. The added information supports the modularisation of \
event generators. Event information is accessed by means of iterators \
supplied with the package. \
 \
This package provides the shared libraries for HepMC."
LICENSE = "GPL-2.0-only"

PV = "2.06.11"

RPM_NAME = "libHepMC4-2.06.11-2.10.aarch64.rpm"
RPM_HASH = "9b303a2dc93c52dab0bc8ea38beb4ded00127cc09834c98eae6ec1e56864694d0fb08faa9c1797d23a463b908d99f01e14bbaec26b542eb982d99ab905c1f079"

RPROVIDES:${PN} += "libHepMC.so.4 \
libHepMC4 \
libHepMCfio.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
