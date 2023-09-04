SUMMARY = "CLI tool for logging into nodes via Teleport SSH"
DESCRIPTION = "A tool that lets end users interact with Teleport nodes. This replaces ssh."
LICENSE = "Apache-2.0"

PV = "13.3.1"

RPM_NAME = "teleport-tsh-13.3.1-1.1.aarch64.rpm"
RPM_HASH = "8ea14e2686ee9eb2394ebd17dce2fb5695a28a27817890e9e51b8d1619c74d9c966101c2f9f4012c4b8095b922084819fb6ff62584d5f749b7310569745a91c0"

RPROVIDES:${PN} += "teleport-tsh"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
