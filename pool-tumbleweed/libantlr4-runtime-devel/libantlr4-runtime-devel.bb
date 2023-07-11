SUMMARY = "Development files for the ANTRL libraries"
DESCRIPTION = "ANTLR runtime libraries for C++. \
ANTLR (ANother Tool for Language Recognition) is a parser generator \
for reading, processing, executing, or translating structured text or \
binary files."
LICENSE = "BSD-3-Clause"

PV = "4.13.0"

RPM_NAME = "libantlr4-runtime-devel-4.13.0-1.2.aarch64.rpm"
RPM_HASH = "c7335119defbcf8c2f7a48bd06f75e96d8fc07624518313cc727618934b4f3023841ffe9584f3394ef850adc3fce9e5e9ecb17a8928e561329677b9bcba81b63"

RPROVIDES:${PN} += "libantlr4-runtime-devel"

RDEPENDS:${PN} += "libantlr4-runtime4-13-0 \
utfcpp-devel"

inherit rpm
