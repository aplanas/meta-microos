SUMMARY = "Industrial I/O library -- development files"
DESCRIPTION = "Library for industrial I/O. \
 \
This sub-package contains the development files."
LICENSE = "LGPL-2.1-or-later"

PV = "0.24"

RPM_NAME = "libiio-devel-0.24-1.5.aarch64.rpm"
RPM_HASH = "45d0c97fcd6cd97c45306a8218532cb7827051aad3a173b8dbbffe3a9658d9e059abbc9a02e8b45c6012a219bef6a41a2d19e833fcc2a8f6005c48c9cf2030f2"

RPROVIDES:${PN} += "libiio-devel \
pkgconfig-libiio"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libiio0"

inherit rpm
