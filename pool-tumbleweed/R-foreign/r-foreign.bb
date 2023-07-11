SUMMARY = "Package provides recommended R-foreign"
DESCRIPTION = "This packages provides R-foreign, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "0.8.84"

RPM_NAME = "R-foreign-0.8.84-46.1.aarch64.rpm"
RPM_HASH = "468984236a69a6b14676a57e2b3ba811ede74588e6fd794419989420f9bcd87fb0b214ed14523b43162d25df62caa782d9a9e17ab0c65f0029ce6a87731df7d9"

RPROVIDES:${PN} += "R-foreign"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1 \
libR.so \
libc.so.6"

inherit rpm
