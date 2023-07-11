SUMMARY = "Headers for the library of Optimized Inner Loops"
DESCRIPTION = "Liboil is a library of functions that are optimized for various \
CPUs."
LICENSE = "BSD-2-Clause"

PV = "0.3.17"

RPM_NAME = "liboil-devel-0.3.17-26.8.aarch64.rpm"
RPM_HASH = "9cae71a492a78c3159d0304691f1e8ff290498ddff4edf0487d73aa83cbab88baeae53308c057b2eaf1e79dc6e5a04e507fa7c042c90905a46e37f4b7f1beeaf"

RPROVIDES:${PN} += "liboil-devel \
pkgconfig-liboil-0.3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libc.so.6 \
liboil-0-3-0 \
liboil-0.3.so.0"

inherit rpm
