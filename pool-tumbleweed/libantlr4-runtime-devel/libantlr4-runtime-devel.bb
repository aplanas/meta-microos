SUMMARY = "Development files for the ANTRL libraries"
DESCRIPTION = "ANTLR runtime libraries for C++. \
ANTLR (ANother Tool for Language Recognition) is a parser generator \
for reading, processing, executing, or translating structured text or \
binary files."
LICENSE = "BSD-3-Clause"

PV = "4.9.3"

RPM_NAME = "libantlr4-runtime-devel-4.9.3-1.10.aarch64.rpm"
RPM_HASH = "4abc58599195b22832b73970b73d36efbedcb6ea65cb730c1c6563ddb22d89c17081be5aa213ca1595675f3574fd972a50ab345d1028ef291d524ec954b17ec1"

RPROVIDES:${PN} += "libantlr4-runtime-devel \
libantlr4-runtime-devel(aarch-64)"

RDEPENDS:${PN} += "libantlr4-runtime4_9_3 \
utfcpp-devel"

inherit rpm
