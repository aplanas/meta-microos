SUMMARY = "Header files and development libraries for civetweb"
DESCRIPTION = "This package contains the header files and development libraries \
for civetweb. If you like to develop programs embedding civetweb on them, \
you will need to install civetweb-devel and check civetweb's API at its \
comprisable header file."
LICENSE = "MIT"

PV = "1.16"

RPM_NAME = "civetweb-devel-1.16-1.1.aarch64.rpm"
RPM_HASH = "8bfc12ddbf6600ecd9c38a9b303e9f4a77267856b78aa4d7abb03982f513fc766f429e1d5552e5b5e2440795ac74a73202059d8766fbf130c24fda1caefaa5d1"

RPROVIDES:${PN} += "civetweb-devel \
civetweb-devel(aarch-64) \
cmake(civetweb) \
pkgconfig(civetweb) \
pkgconfig(civetweb-cpp)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcivetweb-cpp1_15_0 \
libcivetweb1_15_0"

inherit rpm
