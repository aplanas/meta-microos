SUMMARY = "C library for quantum-resistant cryptographic algorithms"
DESCRIPTION = "liboqs is a C library for quantum-resistant cryptographic algorithms. \
See the bundled README.md for particular limitations on intended use."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "liboqs0-0.7.1-6.1.aarch64.rpm"
RPM_HASH = "e0ea9cbc07b4df163f1066e9588effe116a8d5ae39c98baf6fa29085b1021a139c5cf18f377a3618b362f300dfebd6f2bac9f40f5bff28fbc0538f83099f8df8"

RPROVIDES:${PN} += "liboqs.so.0 \
liboqs0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libcrypto.so.3"

inherit rpm
