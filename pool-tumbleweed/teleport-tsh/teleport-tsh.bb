SUMMARY = "CLI tool for logging into nodes via Teleport SSH"
DESCRIPTION = "A tool that lets end users interact with Teleport nodes. This replaces ssh."
LICENSE = "Apache-2.0"

PV = "13.0.3"

RPM_NAME = "teleport-tsh-13.0.3-1.1.aarch64.rpm"
RPM_HASH = "2b0256dca75ddd0ee53f26ca9a60451bbf84b35c456374c539bcf0ce06372ea6cf0d6a9aabbe335ef14a56e837bd785e563e91d9b4ee43722f9611cbeec62ca6"

RPROVIDES:${PN} += "teleport-tsh \
teleport-tsh(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
