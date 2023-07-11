SUMMARY = "Headers for liboqs, a library for quantum-resistant cryptography"
DESCRIPTION = "liboqs is a C library for quantum-resistant cryptographic algorithms. \
See the bundled README.md for particular limitations on intended use."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "liboqs-devel-0.8.0-1.2.aarch64.rpm"
RPM_HASH = "ac32c19defe3835235b376009bb0ede0390807a3312553854b419799536e7c051394f04374ec62b56ae94341f994926b25e083d18797e759cc2da29c1cc69185"

RPROVIDES:${PN} += "cmake-liboqs \
liboqs-devel \
pkgconfig-liboqs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liboqs3 \
pkgconfig-openssl"

inherit rpm
