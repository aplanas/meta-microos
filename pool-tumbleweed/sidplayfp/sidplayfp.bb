SUMMARY = "SID chip music module player"
DESCRIPTION = "A player for playing SID music modules originally created on the Commodore 64 \
and compatibles."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.1"

RPM_NAME = "sidplayfp-2.4.1-1.2.aarch64.rpm"
RPM_HASH = "7b8e61837cc2fd1606f0ae3be7578e58f3dd860ac19a75a79e7e63706d9c58e66fde98b57ee4f0932551dcb056fe9e4551feefb6af1389d634cf0d2b8c051707"

RPROVIDES:${PN} += "sidplayfp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libpulse-simple.so.0 \
libpulse.so.0 \
libsidplayfp.so.6 \
libstdc++.so.6 \
libstilview.so.0"

inherit rpm
