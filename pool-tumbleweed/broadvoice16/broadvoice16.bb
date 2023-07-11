SUMMARY = "BroadVoice 16 Speech Codec"
DESCRIPTION = "BroadVoice is a family of speech coding algorithms created by \
Broadcom and standardized by CableLabs, SCTE, and ANSI for Voice over \
IP applications in cable telephony. BroadVoice is also part of the \
ITU-T Recommendations J.161 and J.361."
LICENSE = "LGPL-2.1-only"

PV = "1.2"

RPM_NAME = "broadvoice16-1.2-3.8.aarch64.rpm"
RPM_HASH = "922901bcda6f15e4f700102146dfc846f1394fbbfb768c49622fce0039303a5a85059c273335737b3e6984be8e1afd1b463cf9d4b1bca8c006c43536b14b8332"

RPROVIDES:${PN} += "broadvoice16 \
libbv16.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
