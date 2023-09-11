SUMMARY = "Development files for libxml2, an XML manipulation library"
DESCRIPTION = "The XML C library can load and save extensible data structures \
or manipulate any kind of XML files. \
 \
This subpackage contains header files for developing \
applications that want to make use of libxml."
LICENSE = "MIT"

PV = "2.10.4"

RPM_NAME = "libxml2-devel-2.10.4-3.1.aarch64.rpm"
RPM_HASH = "a3864e34aaa8f2175ad675c6173706c9e8becb66896546e751aeae197739106e5f7d04c258ef331e0b8bd3eb061e45b9af2ceebc1859b39f19c9d560bebc16fe"

RPROVIDES:${PN} += "libxml2-devel \
pkgconfig-libxml-2.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
glibc-devel \
libxml2 \
libxml2-2 \
libxml2-tools \
pkgconfig-liblzma \
pkgconfig-zlib \
readline-devel \
xz-devel"

inherit rpm
