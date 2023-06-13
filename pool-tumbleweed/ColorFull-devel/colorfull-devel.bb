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

RPM_NAME = "ColorFull-devel-1.1-1.24.aarch64.rpm"
RPM_HASH = "68d432dc9430138314e2d82b6fe19a60464e435f8348f9cf5dc7519473285e7020968b4cf636c046b08ea52f42acfd0c590902fdc86af76ec8d83853def50c81"

RPROVIDES:${PN} += "ColorFull-devel \
ColorFull-devel(aarch-64) \
pkgconfig(ColorFull)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libColorFull0"

inherit rpm
