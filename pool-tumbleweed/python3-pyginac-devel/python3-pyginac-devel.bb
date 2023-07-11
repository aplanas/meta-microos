SUMMARY = "Headers and pkgconfig file for pyginac"
DESCRIPTION = "PyGiNaC is a Python package that provides an interface to the C++ library \
GiNaC, which is an open framework for symbolic computation within C++. PyGiNaC \
is implemented with the help of the Boost.Python library. \
 \
This package provides the header and pkgconfig file used when developing against \
pyginac."
LICENSE = "GPL-2.0-only"

PV = "1.5.5"

RPM_NAME = "python3-pyginac-devel-1.5.5-2.24.aarch64.rpm"
RPM_HASH = "e21b68a698e06ff6db0fa8c3ec6b6298f02de3c462727d6a7bf01390ed5f4daaddc7dbd9a58ce35ffd9e53c34dd8c4dfcc8b647fadd9dbea0bc87e55a118d82d"

RPROVIDES:${PN} += "pkgconfig-pyginac \
python3-pyginac-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-ginac \
python3-pyginac"

inherit rpm
