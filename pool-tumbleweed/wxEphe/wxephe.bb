SUMMARY = "Astronomical ephemeris for the Sun, Moon and solar system planets"
DESCRIPTION = "wxEphe displays astronomical ephemeris for the Sun, the Moon and \
solar system planets, given the date and observer's location."
LICENSE = "GPL-3.0-only"

PV = "1.8"

RPM_NAME = "wxEphe-1.8-1.3.aarch64.rpm"
RPM_HASH = "41e9121e34b856da597313db55aee8889a57e025b137c8654a55ca123a4f63abc4e9bf723039ff82011fdfa3a0b6418f3aa9af21c24bbf414d7ba145028c678d"

RPROVIDES:${PN} += "wxEphe"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-baseu-xml-suse.so.9.0.0 \
libwx-gtk2u-core-suse.so.9.0.0"

inherit rpm
