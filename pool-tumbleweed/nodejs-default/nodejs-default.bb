SUMMARY = "Default version of nodejs"
DESCRIPTION = "Depends on the most current and recommended version of nodejs for \
the current architecture and codestream."
LICENSE = "MIT"

PV = "6.0"

RPM_NAME = "nodejs-default-6.0-1.1.aarch64.rpm"
RPM_HASH = "fafc932936f8fb08ed7cfd145f45665798097b6ed3462baa7ef4e60f3b0b6d419f068dbbb503c039d4168a5a032ba45d90fd50bd8bde3d67bba8313b27613d44"

RPROVIDES:${PN} += "nodejs \
nodejs-default \
nodejs-engine"

RDEPENDS:${PN} += "nodejs-common \
nodejs20"

inherit rpm
