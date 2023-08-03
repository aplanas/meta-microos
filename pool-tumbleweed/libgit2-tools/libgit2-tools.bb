SUMMARY = "A Git command-line interface based on libgit2"
DESCRIPTION = "This package contains a git cli based on libgit2."
LICENSE = "GPL-2.0-only-with-GCC-exception-2.0"

PV = "1.7.0"

RPM_NAME = "libgit2-tools-1.7.0-1.1.aarch64.rpm"
RPM_HASH = "0d17955e0657c28633c0cdf80f85f47bd9d1553e96c8c21c39a8c087294ddf302e067e400e46fb4df606c98194be3085784fe2bdce6454b8a0621deeeea190a8"

RPROVIDES:${PN} += "libgit2-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libpcre2-8.so.0 \
libssh2.so.1 \
libssl.so.3 \
libz.so.1"

inherit rpm
