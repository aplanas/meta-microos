SUMMARY = "Development files for mimalloc"
DESCRIPTION = "This is a general purpose allocator. \
It is a drop-in replacement for malloc and can be used in other \
programs without code changes. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of mimalloc."
LICENSE = "MIT"

PV = "2.0.9"

RPM_NAME = "mimalloc-devel-2.0.9-1.3.aarch64.rpm"
RPM_HASH = "2bc50d10a61f0e84a6c7a9c7651f544ea7a3a029e27b753de7eed8ca2b4987e2a10ad1edf9e1e53a512a95d48e1be12912ff0b629c9f812aa65f055dbc62f478"

RPROVIDES:${PN} += "cmake-mimalloc \
mimalloc-devel \
pkgconfig-mimalloc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmimalloc2"

inherit rpm
