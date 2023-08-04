SUMMARY = "CLI tool for logging into nodes via Teleport SSH"
DESCRIPTION = "A tool that lets end users interact with Teleport nodes. This replaces ssh."
LICENSE = "Apache-2.0"

PV = "13.3.0"

RPM_NAME = "teleport-tsh-13.3.0-1.1.aarch64.rpm"
RPM_HASH = "a1450f3cd581343ebd2e8622a5eb5e109c5b0432eddfc5a24fc2a57f46316682b55e01db0050a62d3b9da64a17507fd32e48f48e34dc9c80d9980178051e9fc4"

RPROVIDES:${PN} += "teleport-tsh"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
