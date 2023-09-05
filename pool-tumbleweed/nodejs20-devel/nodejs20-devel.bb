SUMMARY = "Development headers for NodeJS 20.x"
DESCRIPTION = "This package provides development headers for Node.js needed for creation \
of binary modules."
LICENSE = "MIT"

PV = "20.5.1"

RPM_NAME = "nodejs20-devel-20.5.1-2.1.aarch64.rpm"
RPM_HASH = "f0d6b33122733ba30ab410f7a5b16c1ec399b5eea14a18815870a4be9c5b3649e9cfadf5cbbf51186f9647bec51942ae28f59c73a6d1854d1e1c7bc7e104a91c"

RPROVIDES:${PN} += "nodejs-devel \
nodejs20-devel"

RDEPENDS:${PN} += "nodejs20 \
npm20"

inherit rpm
