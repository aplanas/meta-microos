SUMMARY = "C git library"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to compile and develop applications that use libgit2."
LICENSE = "GPL-2.0-only-with-GCC-exception-2.0"

PV = "1.6.4"

RPM_NAME = "libgit2-devel-1.6.4-1.2.aarch64.rpm"
RPM_HASH = "0da767fef922f5818cd1610fb24ccde72df314db0252ce5b635e58f7dd5444fa03e8b080459ec4a037ef1650d5bfc0a41f6aa38a6ce0ba51d9bfe197183d0c1e"

RPROVIDES:${PN} += "libgit2-devel \
pkgconfig-libgit2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgit2-1-6 \
pkgconfig-libpcre2-8 \
pkgconfig-openssl \
pkgconfig-zlib"

inherit rpm
