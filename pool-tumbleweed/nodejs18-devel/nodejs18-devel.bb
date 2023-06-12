SUMMARY = "Development headers for NodeJS 18.x"
DESCRIPTION = "This package provides development headers for Node.js needed for creation \
of binary modules."
LICENSE = "MIT"

PV = "18.16.0"

RPM_NAME = "nodejs18-devel-18.16.0-1.2.aarch64.rpm"
RPM_HASH = "155070e5783ab3972c2d28261e20e57e1e16f5ac0fb8a0546b3a3794941b7bfb377b02bac94cbd4b4d5140c0813f3a026d3738a54dbe470704cb039b174d0888"

RPROVIDES:${PN} += "nodejs-devel \
nodejs18-devel \
nodejs18-devel(aarch-64)"
RDEPENDS:${PN} += "nodejs18 \
npm18"

inherit rpm
