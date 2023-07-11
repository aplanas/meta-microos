SUMMARY = "An Implementation of the Service Location Protocol V2"
DESCRIPTION = "Service Location Protocol is an IETF standards track protocol that \
provides a framework that allows networking applications to discover \
the existence, location, and configuration of networked services in \
networks."
LICENSE = "BSD-3-Clause"

PV = "2.0.0"

RPM_NAME = "libslp1-2.0.0-21.5.aarch64.rpm"
RPM_HASH = "cab6c87087be95f4de9b802284be83681d6bfa42474d182d09bd61f6aff0be9cbfa05a94ac42565ace1c20fa7778880229ceebab0cfc0c49650753db7c13d54b"

RPROVIDES:${PN} += "libslp.so.1 \
libslp1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
