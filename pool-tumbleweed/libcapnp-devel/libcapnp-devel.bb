SUMMARY = "Development headers for the Cap'n Proto C++ Library"
DESCRIPTION = "Cap'n Proto is a binary data interchange format and capability-based \
RPC system. \
 \
This package provides development headers for capnproto."
LICENSE = "MIT"

PV = "0.10.4"

RPM_NAME = "libcapnp-devel-0.10.4-1.2.aarch64.rpm"
RPM_HASH = "370720a433da1e82e4fe076c8519ee61f881b326cb1c5eb1888884efe28fe5e47b3793991ec0e574c348ca4ef1ecdc69cb93d89e7bdb8a88820be39788933ace"

RPROVIDES:${PN} += "cmake-CapnProto \
libcapnp-devel \
pkgconfig-capnp \
pkgconfig-capnp-json \
pkgconfig-capnp-rpc \
pkgconfig-capnp-websocket \
pkgconfig-capnpc \
pkgconfig-kj \
pkgconfig-kj-async \
pkgconfig-kj-gzip \
pkgconfig-kj-http \
pkgconfig-kj-test \
pkgconfig-kj-tls"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcapnp-0-10-4"

inherit rpm
