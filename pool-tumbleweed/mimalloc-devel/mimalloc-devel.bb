SUMMARY = "Development files for mimalloc"
DESCRIPTION = "This is a general purpose allocator. \
It is a drop-in replacement for malloc and can be used in other \
programs without code changes. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of mimalloc."
LICENSE = "MIT"

PV = "2.0.9"

RPM_NAME = "mimalloc-devel-2.0.9-1.4.aarch64.rpm"
RPM_HASH = "f7dc7acf380ae61d96af1adba55bf54dd5ffdf990baa920e8c1a16863453664ec9ed864dba0c0953decf9336c52abb29a9dcd94630b4407e7e3b7f472409ea35"

RPROVIDES:${PN} += "cmake-mimalloc \
mimalloc-devel \
pkgconfig-mimalloc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmimalloc2"

inherit rpm
