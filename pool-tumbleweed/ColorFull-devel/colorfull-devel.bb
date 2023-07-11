SUMMARY = "Development files for ColorFull, a library for calculations in QCD color space"
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
This package provides the headers and source files needed for developing applications using ColorFull."
LICENSE = "GPL-2.0"

PV = "1.1"

RPM_NAME = "ColorFull-devel-1.1-1.25.aarch64.rpm"
RPM_HASH = "116c6a051051a0aa0bf184a00a6d0d099112b1b14d00d05fa5a2dbe4f840a8871c14b13cab5a6ccdf4fb966e7fbc7083822693e51a4c7b63f8eb7552daa869b8"

RPROVIDES:${PN} += "ColorFull-devel \
pkgconfig-ColorFull"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libColorFull0"

inherit rpm
