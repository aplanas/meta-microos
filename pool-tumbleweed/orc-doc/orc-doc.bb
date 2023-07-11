SUMMARY = "The Oil Runtime Compiler Library - Documentation"
DESCRIPTION = "Orc is a library and set of tools for compiling and executing very simple \
programs that operate on arrays of data.  The “language” is a generic \
assembly language that represents many of the features available in SIMD \
architectures, including saturated addition and subtraction, and many \
arithmetic operations."
LICENSE = "BSD-3-Clause"

PV = "0.4.34"

RPM_NAME = "orc-doc-0.4.34-1.1.aarch64.rpm"
RPM_HASH = "1ff876c99d43f248ef125639c6c870ee059a40494200eabfab86ea30f6f6153325c2a9d746ef4e840f1e271044a7baac443f27031b7ef1d855194b22c39f5777"

RPROVIDES:${PN} += "orc-doc"

RDEPENDS:${PN} += ""

inherit rpm
