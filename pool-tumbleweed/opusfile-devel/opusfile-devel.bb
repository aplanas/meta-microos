SUMMARY = "Development package for opusfile"
DESCRIPTION = "Files for development with opusfile."
LICENSE = "BSD-3-Clause"

PV = "0.12"

RPM_NAME = "opusfile-devel-0.12-2.4.aarch64.rpm"
RPM_HASH = "15994b607f554391d7adb38a469383536849cb24deb23729014d4c1b392806dc7a1085864a2c6633dec38f3a2ed4caa1bd31b5c4ee9eaa60a86b73da5f2ba42c"

RPROVIDES:${PN} += "opusfile-devel \
pkgconfig-opusfile \
pkgconfig-opusurl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopusfile0 \
pkgconfig \
pkgconfig-ogg \
pkgconfig-openssl \
pkgconfig-opus \
pkgconfig-opusfile"

inherit rpm
