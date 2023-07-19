SUMMARY = "CLI tool for logging into nodes via Teleport SSH"
DESCRIPTION = "A tool that lets end users interact with Teleport nodes. This replaces ssh."
LICENSE = "Apache-2.0"

PV = "13.2.1"

RPM_NAME = "teleport-tsh-13.2.1-1.1.aarch64.rpm"
RPM_HASH = "fceaf0a0f019f7db8b27646efc9516504852e35b041055870151e50d5d3e7d1ee7598ec04037129abc3bdb2c4deea2747c06dbd66728b072da056abfec33fafa"

RPROVIDES:${PN} += "teleport-tsh"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
