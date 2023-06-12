SUMMARY = "MinGW-w64 headers for Win32 and Win64"
DESCRIPTION = "MinGW-w64 delivers runtime, headers and libs for developing both 64 \
bit (x64) and 32 bit (x86) windows applications using GCC and other \
free software compilers. \
 \
This subpackage contains the header files."
LICENSE = "SUSE-Public-Domain"

PV = "10.0.0"

RPM_NAME = "mingw32-headers-10.0.0-1.3.noarch.rpm"
RPM_HASH = "e47b48922f6da81feb76f2fb852569104a5538eed7a4505631673997bb99d5cd5796cfba7a1ed7cf92668b3e24a8a0e73e5dfca4106c228bd983f9ca7e6908b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-headers"
RDEPENDS:${PN} += "mingw32-unistd-pthread-devel"

inherit rpm
