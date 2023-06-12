SUMMARY = "Headers for liboqs, a library for quantum-resistant cryptography"
DESCRIPTION = "liboqs is a C library for quantum-resistant cryptographic algorithms. \
See the bundled README.md for particular limitations on intended use."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "liboqs-devel-0.7.1-6.1.aarch64.rpm"
RPM_HASH = "0624a6bec31cfcb1ba33e2ea09026e4f931eb57e8a5d5a2d94df3a8f95f5fd58442e5a6855ffd669a58ecb114be72c3a06feef8aa1cc13c917206d802b908dee"

RPROVIDES:${PN} += "cmake(liboqs) \
liboqs-devel \
liboqs-devel(aarch-64)"
RDEPENDS:${PN} += "liboqs0"

inherit rpm
