SUMMARY = "CLI tool for logging into nodes via Teleport SSH"
DESCRIPTION = "A tool that lets end users interact with Teleport nodes. This replaces ssh."
LICENSE = "Apache-2.0"

PV = "13.2.0"

RPM_NAME = "teleport-tsh-13.2.0-1.1.aarch64.rpm"
RPM_HASH = "cc752b732c6446917693edeb663ec233cc5198553fadd93dfa1d9c5ff9003d22d62d6769d3ca95f1fb281e60d1a6fceb3b2a2c5fcd60aa5c23d21e22cf4e55d7"

RPROVIDES:${PN} += "teleport-tsh"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
