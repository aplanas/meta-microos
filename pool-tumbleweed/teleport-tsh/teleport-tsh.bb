SUMMARY = "CLI tool for logging into nodes via Teleport SSH"
DESCRIPTION = "A tool that lets end users interact with Teleport nodes. This replaces ssh."
LICENSE = "Apache-2.0"

PV = "13.3.8"

RPM_NAME = "teleport-tsh-13.3.8-1.1.aarch64.rpm"
RPM_HASH = "25407c1653cb032a5dfcf67afe7934b748b6896dbd4ecf9aae825284b44f9e163cf82d148a10e637193a69c58b4b1ff30b65281361b1b3093b981990d220961c"

RPROVIDES:${PN} += "teleport-tsh"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
