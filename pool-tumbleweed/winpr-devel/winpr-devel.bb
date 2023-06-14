SUMMARY = "Windows Portable Runtime development files"
DESCRIPTION = "This package contains header files for developing applications that \
use the winpr and winpr-tools libraries."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "winpr-devel-2.10.0-3.1.aarch64.rpm"
RPM_HASH = "dc3e9701e4f51e0f0a675b79a3b3815fc08f4ac17adab827a21900d8faeed26d7096ffcd8697dab2679c0531bf352dd7d1d853def1081dd742d1e32080a3041c"

RPROVIDES:${PN} += "cmake-WinPR \
libwinpr2-devel \
pkgconfig-winpr-tools2 \
pkgconfig-winpr2 \
winpr-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake \
libwinpr2-2 \
pkgconfig-libssl \
pkgconfig-winpr2"

inherit rpm
