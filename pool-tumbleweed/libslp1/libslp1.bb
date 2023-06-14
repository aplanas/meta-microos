SUMMARY = "An Implementation of the Service Location Protocol V2"
DESCRIPTION = "Service Location Protocol is an IETF standards track protocol that \
provides a framework that allows networking applications to discover \
the existence, location, and configuration of networked services in \
networks."
LICENSE = "BSD-3-Clause"

PV = "2.0.0"

RPM_NAME = "libslp1-2.0.0-21.4.aarch64.rpm"
RPM_HASH = "22f46b4bc58e93493357ab3778ffcb5d258f4a934d119d067831a1ce0a50a94af3626ad94686f125b5b730d489a3e7bb8af27df14abd98b2700e9588c1c351f6"

RPROVIDES:${PN} += "libslp.so.1 \
libslp1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
