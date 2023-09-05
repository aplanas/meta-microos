SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "13.2.1+git7683"

RPM_NAME = "libm2log18-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "bf6e6a2d7f3f32b8458a91907aa1c850c593a8536124b34ed0046d43f95d30a51deecfa837e3d986f8423f38b0b414eca54705f648b0b85e622bdbe838ad4158"

RPROVIDES:${PN} += "libm2log.so.18 \
libm2log18"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
