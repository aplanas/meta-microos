SUMMARY = "CLI tool for logging into nodes via Teleport SSH"
DESCRIPTION = "A tool that lets end users interact with Teleport nodes. This replaces ssh."
LICENSE = "Apache-2.0"

PV = "13.2.2"

RPM_NAME = "teleport-tsh-13.2.2-1.1.aarch64.rpm"
RPM_HASH = "64052b635bdd40f4bbdd271e1116b6b1aa0497a47c44ba30ad4607b258692ea92da201b0f73019ca0b8d383a7e2a743da0b2be1855a655e7898d3f5a8cee768a"

RPROVIDES:${PN} += "teleport-tsh"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
