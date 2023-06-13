SUMMARY = "C headers for developing programs with libsvm"
DESCRIPTION = "This package contains the libraries and header files needed for \
developing applications with libsvm."
LICENSE = "BSD-3-Clause"

PV = "3.30"

RPM_NAME = "libsvm-devel-3.30-1.4.aarch64.rpm"
RPM_HASH = "ac20f1d8cdb8e490f64a2489d0bae336069d986a4cc9f84a44a25c3f28144c5612e89c4da759a6da8b23a1491d4f35e30e090e5b4ccb4f66081092ce99b6084c"

RPROVIDES:${PN} += "libsvm-devel \
libsvm-devel(aarch-64)"

RDEPENDS:${PN} += "libsvm3"

inherit rpm
