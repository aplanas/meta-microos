SUMMARY = "openEMS development files"
DESCRIPTION = "This package contains libraries for developing applications \
that use openEMS."
LICENSE = "GPL-3.0-only"

PV = "0.0.35"

RPM_NAME = "openEMS-devel-0.0.35-5.36.aarch64.rpm"
RPM_HASH = "9882c1e04d6a14b2da7271b38d98d0ebe5ceac2c88242a710f6b0eb5ee95f0a57e9614a0afbd7748285ff0b32cf7505a7573ec254f63b38b82f65447be6a8672"

RPROVIDES:${PN} += "openEMS-devel \
openEMS-devel(aarch-64)"

RDEPENDS:${PN} += "libnf2ff0 \
libopenEMS0"

inherit rpm
