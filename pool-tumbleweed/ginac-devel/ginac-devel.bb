SUMMARY = "GiNaC development libraries and header files"
DESCRIPTION = "GiNaC (which stands for 'GiNaC is Not a CAS (Computer Algebra System)') is an \
open framework for symbolic computation within the C++ programming language. \
 \
This package contains the libraries, include files and other resources you \
use to develop GiNaC applications."
LICENSE = "GPL-2.0-only"

PV = "1.8.6"

RPM_NAME = "ginac-devel-1.8.6-1.1.aarch64.rpm"
RPM_HASH = "e9013b58cbd9f82bb29226239831c9f886b4a13fe5b136b5af4670d2de96bf7f3634df62d9031cbe37efa8365b433f313df74a79953c3a653740ccd02dc3cd25"

RPROVIDES:${PN} += "cmake-ginac \
ginac-devel \
libginac-devel \
pkgconfig-ginac"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cln-devel \
libginac11 \
pkgconfig-cln"

inherit rpm
