SUMMARY = "Vc Static Library"
DESCRIPTION = "Vc is a free software library to ease explicit vectorization of C++ code. It \
has an intuitive API and provides portability between different compilers and \
compiler versions as well as portability between different vector instruction \
sets. \
 \
This package provides the Vc static library."
LICENSE = "BSD-3-Clause"

PV = "1.4.3"

RPM_NAME = "Vc-devel-static-1.4.3-1.6.aarch64.rpm"
RPM_HASH = "7a205a661fe892702bec2403b41828bdf669fc1177868dbacc9722ce35ecc7b7674881708870ee4fe93f67b119199c5603e636e849d8dac39044714b447446b5"

RPROVIDES:${PN} += "Vc-devel-static \
Vc-devel-static(aarch-64)"
RDEPENDS:${PN} += "Vc-devel"

inherit rpm
