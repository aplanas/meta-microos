SUMMARY = "Development files for libjodycode"
DESCRIPTION = "Development files and headers for libjodycode"
LICENSE = "MIT"

PV = "3.1"

RPM_NAME = "libjodycode-devel-3.1-1.1.aarch64.rpm"
RPM_HASH = "f29ceb4ea70370897e486a2e9a71f72aca7b6ae1b5f934a30fc91aa433c0e83bed88e58a01ac55180943239b20f56ee53db2781c9925beecd60246bb4b48ad50"

RPROVIDES:${PN} += "libjodycode-devel"

RDEPENDS:${PN} += "libjodycode3"

inherit rpm
