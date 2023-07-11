SUMMARY = "Development files for the Secure Reliable Transport (SRT) library"
DESCRIPTION = "This package contains all necessary include files and libraries \
needed to develop applications with Secure Reliable Transport \
(SRT) support."
LICENSE = "MPL-2.0"

PV = "1.5.1"

RPM_NAME = "srt-devel-1.5.1-1.5.aarch64.rpm"
RPM_HASH = "a49e9d65acc9d50906b6576b6ee13984288e92f2c7d1a547aa8a03c4cda289ac2b791fc852c2ab87983058419b5ce6b7e9dbbb5dfd58f0f75bb54d9b18f2d3ee"

RPROVIDES:${PN} += "pkgconfig-haisrt \
pkgconfig-srt \
srt-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsrt1-5 \
pkgconfig-libcrypto \
pkgconfig-openssl \
srt"

inherit rpm
