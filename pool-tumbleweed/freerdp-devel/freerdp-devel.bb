SUMMARY = "Development Files for freerdp"
DESCRIPTION = "This package contains development files necessary for developing applications \
based on libfreerdp."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "freerdp-devel-2.10.0-3.2.aarch64.rpm"
RPM_HASH = "918af6427fc0355ba68b57319dd2edce0619b6da6eca05089471673e6a66256fc2a95a68dae27bbf345b6f52233d7c334c5c09d4e3d0fcf4f9b02a37543a377b"

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
