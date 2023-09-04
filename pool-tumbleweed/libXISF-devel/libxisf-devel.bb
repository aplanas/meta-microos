SUMMARY = "Development files for libXISF"
DESCRIPTION = "This package contains all the needed development files to use libXISF."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.9"

RPM_NAME = "libXISF-devel-0.2.9-1.1.aarch64.rpm"
RPM_HASH = "a15b5f083b5090eed0f7a68abcfa01e39e19e90f60a8e0a5f1393d55a34b7e12eb0b69b1c2558ae992b17ae5d9dde91fda31e0cfea4fb719a4bbad057e117cd8"

RPROVIDES:${PN} += "libXISF-devel \
pkgconfig-libxisf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXISF0"

inherit rpm
