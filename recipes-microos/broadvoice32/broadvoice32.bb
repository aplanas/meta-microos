SUMMARY = "BroadVoice 32 Speech Codec"
DESCRIPTION = "BroadVoice is a family of speech coding algorithms created by \
Broadcom and standardized by CableLabs, SCTE, and ANSI for Voice over \
IP applications in cable telephony. BroadVoice is also part of the \
ITU-T Recommendations J.161 and J.361."
LICENSE = "LGPL-2.1-only"

PV = "1.2"

RPM_NAME = "broadvoice32-1.2-2.7.aarch64.rpm"
RPM_HASH = "fcc9020926c06c2059f3f694587e720bf07a907c065faadcea004acd6d259c6e58c215fcd683aca5bf6a5ea4a17e0bfbe437bbedad083fd7d4fee2a2de2b6dd3"

RPROVIDES:${PN} += "broadvoice32 \
broadvoice32(aarch-64) \
libbv32.so()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
