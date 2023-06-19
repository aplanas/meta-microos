SUMMARY = "C git library"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to compile and develop applications that use libgit2."
LICENSE = "GPL-2.0-only-with-GCC-exception-2.0"

PV = "1.6.4"

RPM_NAME = "libgit2-devel-1.6.4-1.1.aarch64.rpm"
RPM_HASH = "d94f7f4f841fb7d8256adb2b27b8bab7d3f2870720e12bd060985e2b932f42484f8712502d150512d12daccc8bc61b980cf99720248695280705bd514447093b"

RPROVIDES:${PN} += "libgit2-devel \
pkgconfig-libgit2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgit2-1-6 \
pkgconfig-libpcre2-8 \
pkgconfig-openssl \
pkgconfig-zlib"

inherit rpm
