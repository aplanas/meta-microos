SUMMARY = "MinGW-w64 headers for Win32 and Win64"
DESCRIPTION = "MinGW-w64 delivers runtime, headers and libs for developing both 64 \
bit (x64) and 32 bit (x86) windows applications using GCC and other \
free software compilers. \
 \
This subpackage contains the header files."
LICENSE = "SUSE-Public-Domain"

PV = "10.0.0"

RPM_NAME = "mingw64-headers-10.0.0-1.3.noarch.rpm"
RPM_HASH = "da6dcb572ad013b751bf80d578c753e410f9d5a8ba491f644bd5c261ed16d14c6a5d4f0ac85ceb400c9d2d79411c15af55289adabd59d2e4b0478e02d34b699f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-headers"

RDEPENDS:${PN} += "mingw64-unistd-pthread-devel"

inherit rpm
