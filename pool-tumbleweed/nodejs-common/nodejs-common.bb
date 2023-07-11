SUMMARY = "Common files for the NodeJS ecosystem"
DESCRIPTION = "Common NodeJS files that allow recursive invocation of Node executable \
while retaining the same codestream version."
LICENSE = "MIT"

PV = "6.0"

RPM_NAME = "nodejs-common-6.0-1.1.aarch64.rpm"
RPM_HASH = "7ae66247352d05c28bd2a92d65d1ecc61b1960fce8c59f1f6efd19bacd34180834e4cd4cd9b53854211bcbc8a67491d10066d3de88ab431ce76301fc67267159"

RPROVIDES:${PN} += "nodejs-common"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libalternatives.so.1 \
libc.so.6 \
nodejs"

inherit rpm
