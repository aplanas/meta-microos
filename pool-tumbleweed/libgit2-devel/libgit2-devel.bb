SUMMARY = "C git library"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to compile and develop applications that use libgit2."
LICENSE = "GPL-2.0-only-with-GCC-exception-2.0"

PV = "1.7.0"

RPM_NAME = "libgit2-devel-1.7.0-1.1.aarch64.rpm"
RPM_HASH = "a28d186eacb20dccd638f385d2f300df439090b35e8ea0d7c375e710b12effae28e7491b61a46012f31b208414316892872c412b5f58c0b9a92de9ef93dded2d"

RPROVIDES:${PN} += "libgit2-devel \
pkgconfig-libgit2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgit2-1-7 \
pkgconfig-libpcre2-8 \
pkgconfig-openssl \
pkgconfig-zlib"

inherit rpm
