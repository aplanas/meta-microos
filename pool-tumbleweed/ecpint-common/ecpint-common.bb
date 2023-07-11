SUMMARY = "Architecture independent data files for libecpint"
DESCRIPTION = "Libecpint is a C++ library for the efficient evaluation of integrals over ab \
initio effective core potentials, using a mixture of generated, recursive \
code and Gauss-Chebyshev quadrature. It is designed to be standalone and \
generic. \
 \
This package contains architecture independent data files for libecpint"
LICENSE = "MIT"

PV = "1.0.7"

RPM_NAME = "ecpint-common-1.0.7-2.11.noarch.rpm"
RPM_HASH = "509bb27c0140cfa5fed9638abfb558b730007080989d598e4a3deec40f8ca519505a37df3b79cdd92b5b4bd224f32193c5809f545f3245875ba8e900a4049c74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ecpint-common"

RDEPENDS:${PN} += "libecpint1"

inherit rpm
