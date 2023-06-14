SUMMARY = "X Window System"
DESCRIPTION = "The 32bit pattern complementing x11."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-x11-32bit-20200505-41.1.aarch64.rpm"
RPM_HASH = "cd2abd6ce2ffbec7716ccd699e774e8e267a29801a6805141f4481453ecafc791929568ae4de2870f162ffd0d5fbe2ecd7ca314f4b5b3d78e0abb50662690f73"

RPROVIDES:${PN} += "pattern- \
patterns-base-x11-32bit"

RDEPENDS:${PN} += ""

inherit rpm
