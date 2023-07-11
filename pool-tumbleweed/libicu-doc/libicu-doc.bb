SUMMARY = "Documentation for the ICU library"
DESCRIPTION = "ICU is a set of C and C++ libraries that provide extensive Unicode \
and locale support. \
This package contains the HTML documentation."
LICENSE = "ICU"

PV = "73.2"

RPM_NAME = "libicu-doc-73.2-1.1.aarch64.rpm"
RPM_HASH = "f7f7e7259a58d6f76ce0ff8dd1f47b5c9c714abb8ded58cc4c5dc4e05dfbe008e1b50c3b9cc929be99a4823a20798638c0b3dcf60f067f786496e6d22fae2693"

RPROVIDES:${PN} += "libicu-doc"

RDEPENDS:${PN} += ""

inherit rpm
