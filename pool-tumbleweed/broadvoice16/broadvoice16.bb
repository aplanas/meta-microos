SUMMARY = "BroadVoice 16 Speech Codec"
DESCRIPTION = "BroadVoice is a family of speech coding algorithms created by \
Broadcom and standardized by CableLabs, SCTE, and ANSI for Voice over \
IP applications in cable telephony. BroadVoice is also part of the \
ITU-T Recommendations J.161 and J.361."
LICENSE = "LGPL-2.1-only"

PV = "1.2"

RPM_NAME = "broadvoice16-1.2-3.7.aarch64.rpm"
RPM_HASH = "07ecae9675afade934cf91948e5934a5a7e53d5521a853156d02277ac8be2ca09d55db23727d1b5f41b53a70bc1d59b5627d156a52b4186d37c49dbd1d5e9593"

RPROVIDES:${PN} += "broadvoice16 \
broadvoice16(aarch-64) \
libbv16.so()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
