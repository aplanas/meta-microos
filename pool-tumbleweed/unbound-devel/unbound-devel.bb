SUMMARY = "Development files for libunbound"
DESCRIPTION = "Unbound is a validating, recursive, and caching DNS(SEC) resolver. \
 \
This package holds the development files to work with libunbound."
LICENSE = "BSD-3-Clause"

PV = "1.18.0"

RPM_NAME = "unbound-devel-1.18.0-1.1.aarch64.rpm"
RPM_HASH = "cadc00c5a1ea73cd0e00237f2884e582b4b3206516a5c5b1416b596e22eefeaf6c71f61fdf1792c290dc2674f4e759547eeaaddd3a98db497e1a01b7980e8b1b"

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
