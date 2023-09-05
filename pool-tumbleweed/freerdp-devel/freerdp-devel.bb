SUMMARY = "Development Files for freerdp"
DESCRIPTION = "This package contains development files necessary for developing applications \
based on libfreerdp."
LICENSE = "Apache-2.0"

PV = "2.11.0"

RPM_NAME = "freerdp-devel-2.11.0-1.1.aarch64.rpm"
RPM_HASH = "f2302fb916ea0d7bc02d50b59678350e91333a899341301ea9208e35885f11519a9d6dc86d86a749519198a3374f6942e1710807d760f75a7e0a8442635e4b41"

RPROVIDES:${PN} += "cmake-FreeRDP \
cmake-FreeRDP-Client \
cmake-FreeRDP-Server \
cmake-FreeRDP-Shadow \
freerdp-devel \
pkgconfig-freerdp-client2 \
pkgconfig-freerdp-server2 \
pkgconfig-freerdp-shadow2 \
pkgconfig-freerdp2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfreerdp2-2 \
pkgconfig-freerdp2 \
pkgconfig-libssl \
pkgconfig-winpr2 \
winpr-devel"

inherit rpm
