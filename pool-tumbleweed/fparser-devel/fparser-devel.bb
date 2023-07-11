SUMMARY = "Development files for libfparser"
DESCRIPTION = "This C++ library offers a class which can be used to parse and \
evaluate a mathematical function from a string (which might be e.g. \
requested from the user). The syntax of the function string is \
similar to mathematical expressions written in C/C++ (the exact \
syntax is specified later in this document). The function can then be \
evaluated with different values of variables. \
 \
For example, a function like 'sin(sqrt(x*x+y*y))' can be parsed from \
a string (either std::string or a C-style string) and then evaluated \
with different values of x and y. This library can be useful for \
evaluating user-inputted functions, or in some cases interpreting \
mathematical expressions in a scripting language."
LICENSE = "LGPL-3.0"

PV = "4.5.2"

RPM_NAME = "fparser-devel-4.5.2-1.32.aarch64.rpm"
RPM_HASH = "005cea9428a072b5f2d76441d8fae6e2d06026bc3e6af8c6195c61aba7fc8378a1fe9ab9b655eefdb9cbbb3ffec269985a6ac893201d7cf0b6286130357a0c8f"

RPROVIDES:${PN} += "fparser-devel \
pkgconfig-fparser"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfparser-4-5-2"

inherit rpm
