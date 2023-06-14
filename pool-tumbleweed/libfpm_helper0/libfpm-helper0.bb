SUMMARY = "Mono.WebServer.FPM Helper"
DESCRIPTION = "Library of Mono.WebServer.FPM Helper."
LICENSE = "MIT"

PV = "4.7.1"

RPM_NAME = "libfpm_helper0-4.7.1-1.16.aarch64.rpm"
RPM_HASH = "5f0f134b216ed5d2f77d8cb7a30b799891e2122ec2bd2b96420dc4c40839c79469df404e18b3d7c5af8c8e936a22e9dd89c61c289b23ac6b55b1fcf8955cd84a"

RPROVIDES:${PN} += "libfpm-helper.so.0 \
libfpm-helper0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
