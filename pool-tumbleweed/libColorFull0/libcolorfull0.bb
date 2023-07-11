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

RPM_NAME = "libColorFull0-1.1-1.25.aarch64.rpm"
RPM_HASH = "98e385bb4e79696c68157faff0750b4390cc3c6d0456f5d6dc476559762685a279b9457fce2e26fb1569bb551c92b5688046441e200b6581a58a8d17003cf643"

RPROVIDES:${PN} += "libColorFull.so.0 \
libColorFull0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
