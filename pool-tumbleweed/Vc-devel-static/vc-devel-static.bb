SUMMARY = "Vc Static Library"
DESCRIPTION = "Vc is a free software library to ease explicit vectorization of C++ code. It \
has an intuitive API and provides portability between different compilers and \
compiler versions as well as portability between different vector instruction \
sets. \
 \
This package provides the Vc static library."
LICENSE = "BSD-3-Clause"

PV = "1.4.3"

RPM_NAME = "Vc-devel-static-1.4.3-1.7.aarch64.rpm"
RPM_HASH = "27f97108854fdc748c32122e60f9632d879c12d929cc597808e551c9b8b1e00f672cc243ae593f932e2f50ebe31424354abcac4787b43f690b2aa34c5079f531"

RPROVIDES:${PN} += "Vc-devel-static"

RDEPENDS:${PN} += "Vc-devel"

inherit rpm
