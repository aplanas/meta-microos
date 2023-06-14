SUMMARY = "X Window System"
DESCRIPTION = "The 32bit pattern complementing x11_enhanced."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-x11_enhanced-32bit-20200505-41.1.aarch64.rpm"
RPM_HASH = "da61074b3ee9fc3765ca645bab2dfd121250b1a4f333a37a40a4f30dbc17351caf45ad1be1065c4c6b032fb4415ce2719a0da88de7a963ae74df2f7864f5f2a3"

RPROVIDES:${PN} += "pattern- \
patterns-base-x11-enhanced-32bit"

RDEPENDS:${PN} += ""

inherit rpm
