SUMMARY = "Windows Portable Runtime development files"
DESCRIPTION = "This package contains header files for developing applications that \
use the winpr and winpr-tools libraries."
LICENSE = "Apache-2.0"

PV = "2.11.0"

RPM_NAME = "winpr-devel-2.11.0-1.1.aarch64.rpm"
RPM_HASH = "7084b61f31fe9a46bbbfc39029c6ca1284c30a5a1e19c568339627e238f0791f7b0e313cd1e85852f038be99f301ac47c694b59209ec1a5e58b104f942743e7f"

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
