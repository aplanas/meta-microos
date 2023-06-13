SUMMARY = "A Git command-line interface based on libgit2"
DESCRIPTION = "This package contains a git cli based on libgit2."
LICENSE = "GPL-2.0-only-WITH-GCC-exception-2.0"

PV = "1.6.4"

RPM_NAME = "libgit2-tools-1.6.4-1.1.aarch64.rpm"
RPM_HASH = "706418a5e21d0943fc1133139902c86f9169bab3cd32a60ff9d71325903def067f22c91ba136db6caf634094dbe6b8616241d783bee75397f1b3dbf7185abb14"

RPROVIDES:${PN} += "libgit2-tools \
libgit2-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libpcre2-8.so.0()(64bit) \
libssh2.so.1()(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libz.so.1()(64bit)"

inherit rpm
