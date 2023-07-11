SUMMARY = "A Git command-line interface based on libgit2"
DESCRIPTION = "This package contains a git cli based on libgit2."
LICENSE = "GPL-2.0-only-with-GCC-exception-2.0"

PV = "1.6.4"

RPM_NAME = "libgit2-tools-1.6.4-1.2.aarch64.rpm"
RPM_HASH = "ef2a15007f1f0548580d1b414959953073a56f7d01853c2eeced0d2f6361b01db9d19173ed1dc576c34957c1a39db4ddb72a19b108afd75e77d014e2bbd22dd3"

RPROVIDES:${PN} += "libgit2-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libpcre2-8.so.0 \
libssh2.so.1 \
libssl.so.3 \
libz.so.1"

inherit rpm
