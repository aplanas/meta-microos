SUMMARY = "Development files for the Secure Reliable Transport (SRT) library"
DESCRIPTION = "This package contains all necessary include files and libraries \
needed to develop applications with Secure Reliable Transport \
(SRT) support."
LICENSE = "MPL-2.0"

PV = "1.5.2"

RPM_NAME = "srt-devel-1.5.2-1.1.aarch64.rpm"
RPM_HASH = "0ddc665dd2845efa55f1929747122319a278735b3026c033b2937722eed413d93135f868153b8ed04e4a7e935b8a41978d9a39a6c2397a85bef2889cabf2ff4b"

RPROVIDES:${PN} += "pkgconfig-haisrt \
pkgconfig-srt \
srt-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsrt1-5 \
pkgconfig-libcrypto \
pkgconfig-openssl \
srt"

inherit rpm
