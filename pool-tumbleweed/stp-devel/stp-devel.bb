SUMMARY = "Devel files for stp"
DESCRIPTION = "Developmnet files for stp library."
LICENSE = "MIT"

PV = "2.3.3+20220915"

RPM_NAME = "stp-devel-2.3.3+20220915-1.4.aarch64.rpm"
RPM_HASH = "32cd391d32e904687b07400d43bafede38998904ece1550a5cab0990c273cef0cb49f07b30827a6bc7dd22010c31324726f5a37656ac32f0eadf1f4b343ad340"

RPROVIDES:${PN} += "cmake-STP \
stp-devel"

RDEPENDS:${PN} += "libboost-program-options-devel \
libstp2-3 \
minisat-devel \
stp"

inherit rpm
