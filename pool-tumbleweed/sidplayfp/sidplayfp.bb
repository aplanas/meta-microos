SUMMARY = "SID chip music module player"
DESCRIPTION = "A player for playing SID music modules originally created on the Commodore 64 \
and compatibles."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.1"

RPM_NAME = "sidplayfp-2.4.1-1.1.aarch64.rpm"
RPM_HASH = "86c08a18c4b3b58ea08e2b4bb688302a20042f868bafb5b3eaa9ab0de461ffac9c2566d8d590ab74dc8c04400f577e5535137ba7822f77446f412fbf1623fe2d"

RPROVIDES:${PN} += "sidplayfp \
sidplayfp(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libasound.so.2()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libpulse-simple.so.0()(64bit) \
libpulse-simple.so.0(PULSE_0)(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libsidplayfp.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libstilview.so.0()(64bit)"

inherit rpm
