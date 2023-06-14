SUMMARY = "Astronomical ephemeris for the Sun, Moon and solar system planets"
DESCRIPTION = "wxEphe displays astronomical ephemeris for the Sun, the Moon and \
solar system planets, given the date and observer's location."
LICENSE = "GPL-3.0-only"

PV = "1.8"

RPM_NAME = "wxEphe-1.8-1.2.aarch64.rpm"
RPM_HASH = "bae70244f2fc53229cf170b2cce671ca4ca8c594997bf2aae5975029a94dd7b1243c068db01416557cf9005814324c7ae037dbce14eb54905abb44877bf6b6f1"

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
