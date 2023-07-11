SUMMARY = "Development package for LASH"
DESCRIPTION = "This package contains the development files for the LASH system."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.4"

RPM_NAME = "lash-devel-0.5.4-2.12.aarch64.rpm"
RPM_HASH = "2acf27ac22c2ddb0d7451a3e736b6b9cfaa5b583966169046d98a3841180a9eece43a6aee52436c17e3c4629c6acc5c5c364384d4b261a0150b4ba62c92c6c6e"

RPROVIDES:${PN} += "lash-devel \
pkgconfig-lash-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
liblash1 \
libuuid-devel \
pkgconfig-alsa \
pkgconfig-jack \
readline-devel"

inherit rpm
