SUMMARY = "Development headers for NodeJS 20.x"
DESCRIPTION = "This package provides development headers for Node.js needed for creation \
of binary modules."
LICENSE = "MIT"

PV = "20.3.1"

RPM_NAME = "nodejs20-devel-20.3.1-1.1.aarch64.rpm"
RPM_HASH = "105ad478681dbfd41a1b8dd9c7f22a539f84a832c61bcd052c861897143a24236c23e2d4b8d34bf3a36760fb552fa3e60ecfda033a7c8d544ebd24a8e89d230d"

RPROVIDES:${PN} += "nodejs-devel \
nodejs20-devel"

RDEPENDS:${PN} += "nodejs20 \
npm20"

inherit rpm
