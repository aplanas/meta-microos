SUMMARY = "BroadVoice 32 Speech Codec"
DESCRIPTION = "BroadVoice is a family of speech coding algorithms created by \
Broadcom and standardized by CableLabs, SCTE, and ANSI for Voice over \
IP applications in cable telephony. BroadVoice is also part of the \
ITU-T Recommendations J.161 and J.361."
LICENSE = "LGPL-2.1-only"

PV = "1.2"

RPM_NAME = "broadvoice32-1.2-2.8.aarch64.rpm"
RPM_HASH = "9520c62e6cffe7d5ffd4375edebae4b226d7327e0c3580079908ca93ee558292436e48ceefada786f052c4f7c12508ddd934ffbc971ed4b978ef459954575eb8"

RPROVIDES:${PN} += "broadvoice32 \
libbv32.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
