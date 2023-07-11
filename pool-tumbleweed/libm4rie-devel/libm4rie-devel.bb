SUMMARY = "Development files for GF(2^e) arithmetic with libm4rie"
DESCRIPTION = "M4RIE is a library for arithmetic with dense matrices over the \
Galois Field GF(2^e). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libm4rie."
LICENSE = "GPL-2.0-or-later"

PV = "20200125"

RPM_NAME = "libm4rie-devel-20200125-1.3.aarch64.rpm"
RPM_HASH = "5ad320d894401a5792fdc710380b1a6e04c37a19545622ecc3d5deebc86aefb9744180c3712c620995e6a6e00f0dd9bae70706b1ee19e5780822cc3933847974"

RPROVIDES:${PN} += "libm4rie-devel \
pkgconfig-m4rie"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libm4rie-0-0-20200125"

inherit rpm
