SUMMARY = "Development files for libunbound"
DESCRIPTION = "Unbound is a validating, recursive, and caching DNS(SEC) resolver. \
 \
This package holds the development files to work with libunbound."
LICENSE = "BSD-3-Clause"

PV = "1.17.1"

RPM_NAME = "unbound-devel-1.17.1-2.1.aarch64.rpm"
RPM_HASH = "89abd22eafbb06c07f4718368082da5bbb7e32d73e3db68a5174846d9809d1e58ac3b162b3c8a82a8eb80e3b6f18fa1962e395dbdbf34760d5516924a3984061"

RPROVIDES:${PN} += "libunbound-devel \
pkgconfig-libunbound \
unbound-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ldns-devel \
libunbound8 \
openssl-devel \
pkgconfig-libevent \
pkgconfig-python3"

inherit rpm
