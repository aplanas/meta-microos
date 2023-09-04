SUMMARY = "Development headers for NodeJS 20.x"
DESCRIPTION = "This package provides development headers for Node.js needed for creation \
of binary modules."
LICENSE = "MIT"

PV = "20.5.1"

RPM_NAME = "nodejs20-devel-20.5.1-1.1.aarch64.rpm"
RPM_HASH = "22601f65a87409b77bc1bb092913ccc35ef4a36a457d7340dfb958723df31546f9dfc238a3aa50c2ada85e9c37cf10d87ce4c4fe9dd6d393998bd180e99d3ed9"

RPROVIDES:${PN} += "nodejs-devel \
nodejs20-devel"

RDEPENDS:${PN} += "nodejs20 \
npm20"

inherit rpm
