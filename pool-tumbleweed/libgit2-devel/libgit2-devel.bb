SUMMARY = "C git library"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to compile and develop applications that use libgit2."
LICENSE = "GPL-2.0-only-with-GCC-exception-2.0"

PV = "1.7.1"

RPM_NAME = "libgit2-devel-1.7.1-1.1.aarch64.rpm"
RPM_HASH = "f013dc5a93e8865c1458e00bd0da6b9eacc5770288e9e51bbf2db34da74ccdbc17d3ee69660496344d58b7e624af3efa0e57294f5f10e3d53ca0f9dab48c960e"

RPROVIDES:${PN} += "libgit2-devel \
pkgconfig-libgit2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgit2-1-7 \
pkgconfig-libpcre2-8 \
pkgconfig-openssl \
pkgconfig-zlib"

inherit rpm
