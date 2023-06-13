SUMMARY = "Architecture independent data files for libecpint"
DESCRIPTION = "Libecpint is a C++ library for the efficient evaluation of integrals over ab \
initio effective core potentials, using a mixture of generated, recursive \
code and Gauss-Chebyshev quadrature. It is designed to be standalone and \
generic. \
 \
This package contains architecture independent data files for libecpint"
LICENSE = "MIT"

PV = "1.0.7"

RPM_NAME = "ecpint-common-1.0.7-2.10.noarch.rpm"
RPM_HASH = "378353472bdc259711e28e0b20317e9695c5c382bf840b216faad2f04e43d05036738c5a984412968c91c097172c75890662f29f3ae25cddc61dc0a3b15d486c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ecpint-common"

RDEPENDS:${PN} += "libecpint1"

inherit rpm
