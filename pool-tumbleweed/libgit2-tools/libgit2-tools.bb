SUMMARY = "A Git command-line interface based on libgit2"
DESCRIPTION = "This package contains a git cli based on libgit2."
LICENSE = "GPL-2.0-only-with-GCC-exception-2.0"

PV = "1.7.1"

RPM_NAME = "libgit2-tools-1.7.1-1.1.aarch64.rpm"
RPM_HASH = "f663f7ff442b06e6a3032a19b226e4c3e65026e0aa6ba6b92825010802ca440e8c48ffeae848456ee189f4d72ab6ccfc35843cd99e9ac35e09a4e482ba0c3923"

RPROVIDES:${PN} += "libgit2-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libpcre2-8.so.0 \
libssh2.so.1 \
libssl.so.3 \
libz.so.1"

inherit rpm
