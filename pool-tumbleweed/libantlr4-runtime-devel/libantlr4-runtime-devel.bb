SUMMARY = "Development files for the ANTRL libraries"
DESCRIPTION = "ANTLR runtime libraries for C++. \
ANTLR (ANother Tool for Language Recognition) is a parser generator \
for reading, processing, executing, or translating structured text or \
binary files."
LICENSE = "BSD-3-Clause"

PV = "4.13.0"

RPM_NAME = "libantlr4-runtime-devel-4.13.0-2.1.aarch64.rpm"
RPM_HASH = "0f0e45ce250f4ce293eb3756b96df2814b943f5dd0eb447d98da652bd5dcef38b903b596a3ff26517f1c3ee676470cff0eb5ae3824a839da292887fe26e70e71"

RPROVIDES:${PN} += "libantlr4-runtime-devel"

RDEPENDS:${PN} += "libantlr4-runtime4-13-0 \
utfcpp-devel"

inherit rpm
