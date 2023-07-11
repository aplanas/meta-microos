SUMMARY = "Header files and development libraries for civetweb"
DESCRIPTION = "This package contains the header files and development libraries \
for civetweb. If you like to develop programs embedding civetweb on them, \
you will need to install civetweb-devel and check civetweb's API at its \
comprisable header file."
LICENSE = "MIT"

PV = "1.16"

RPM_NAME = "civetweb-devel-1.16-1.2.aarch64.rpm"
RPM_HASH = "8e6f1fbb6cdc3a3a6787a125905b27077e5109dc49673d794966da1a5694322db12604f9e64c5023121e78d5c7e6dae78a8800749531e4fecbfadc3394af41fb"

RPROVIDES:${PN} += "civetweb-devel \
cmake-civetweb \
pkgconfig-civetweb \
pkgconfig-civetweb-cpp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcivetweb-cpp1-15-0 \
libcivetweb1-15-0"

inherit rpm
