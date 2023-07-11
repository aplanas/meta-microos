SUMMARY = "Windows Portable Runtime development files"
DESCRIPTION = "This package contains header files for developing applications that \
use the winpr and winpr-tools libraries."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "winpr-devel-2.10.0-3.2.aarch64.rpm"
RPM_HASH = "f51b219b5b338c3431771bf07afb9eb50d32ae81b5993e48c8b7321f5f9a865aba9a91991500bc00f6e54ba485099bb9c34425b6e0229d01ce34100c4aa5d047"

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
