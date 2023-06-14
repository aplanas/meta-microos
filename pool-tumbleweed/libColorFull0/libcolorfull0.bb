SUMMARY = "C++ library for calculations in QCD (SU(Nc)) color space"
DESCRIPTION = "ColorFull is a C++ library for calculations in QCD (SU(Nc)) color space. It can \
* Square any QCD color amplitude and calculate any interference. \
* Create a trace type basis for any number of quarks and gluons. \
* Read in and write out color bases. \
* Calculate scalar product matrices, i.e., the matrices of scalar products \
  between the basis vectors. \
* Describe the effect of gluon exchange, including calculating the color \
  soft anomalous dimension matrices. \
* Describe the effect of gluon emission. \
* Be interfaced to Herwig++ (>= 2.7) via Matchbox. \
 \
This package provides the shared library for ColorFull."
LICENSE = "GPL-2.0"

PV = "1.1"

RPM_NAME = "libColorFull0-1.1-1.24.aarch64.rpm"
RPM_HASH = "3c189573ccce736db594dd8411d5b4a5d9a6f12230613d5cd1a6cf4cdbe960a19efc51c9e2b07bbf3cd163d64fd19c47a773ddd18e93924a7d14369644c22e82"

RPROVIDES:${PN} += "libColorFull.so.0 \
libColorFull0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
