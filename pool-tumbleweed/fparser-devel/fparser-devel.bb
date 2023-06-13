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

RPM_NAME = "fparser-devel-4.5.2-1.31.aarch64.rpm"
RPM_HASH = "eaa145de02e30c475e737bac3592f2602cc8b3660b9f1f8fc699402b9499ebacee88ee8cdc09cfd3c12c0fab662089e8f9ffcb884607a0ce3c41812b8ab03865"

RPROVIDES:${PN} += "fparser-devel \
fparser-devel(aarch-64) \
pkgconfig(fparser)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfparser-4_5_2"

inherit rpm
