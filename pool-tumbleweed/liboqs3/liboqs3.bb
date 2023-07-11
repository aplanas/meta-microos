SUMMARY = "C library for quantum-resistant cryptographic algorithms"
DESCRIPTION = "liboqs is a C library for quantum-resistant cryptographic algorithms. \
See the bundled README.md for particular limitations on intended use."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "liboqs3-0.8.0-1.2.aarch64.rpm"
RPM_HASH = "dbaa8d39faba03ce43d5fe3e110a830f4dc5c80ea19b261c0b365234fe50a3e5da4540ce21a26b9b6b04f7d272a53bcb0906163632442211446a6040b12a0d32"

RPROVIDES:${PN} += "liboqs.so.3 \
liboqs3"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libcrypto.so.3"

inherit rpm
