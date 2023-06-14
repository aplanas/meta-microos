SUMMARY = "Configuration utilities for bcache"
DESCRIPTION = "This package contains utilities for configuring the bcache Module."
LICENSE = "GPL-2.0-only"

PV = "1.1"

RPM_NAME = "bcache-tools-1.1-7.3.aarch64.rpm"
RPM_HASH = "a652dec6e14edf260090e4c60791ad54a108c298381c9f4f3f5bd1723f97b698c51c905e9e32ae01d2bf80fb4e8a35657b1a5b287c0739dd752387b2d12c23ee"

RPROVIDES:${PN} += "bcache-tools"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/env \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libuuid.so.1"

inherit rpm
