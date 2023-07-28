SUMMARY = "CLI tool for managing a teleport server"
DESCRIPTION = "An administrative tool that can configure Teleport Auth Service."
LICENSE = "Apache-2.0"

PV = "13.2.2"

RPM_NAME = "teleport-tctl-13.2.2-1.1.aarch64.rpm"
RPM_HASH = "e05d42a8e972db22683831318396c83919b6e2ef64af2d2ff8ede2e97d5e8901b2f7d7ccff06c15bc5a9cda605882dfbec6b72fd9b87ca025c41265cc0895f54"

RPROVIDES:${PN} += "teleport-tctl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
