SUMMARY = "Astronomical ephemeris for the Sun, Moon and solar system planets"
DESCRIPTION = "wxEphe displays astronomical ephemeris for the Sun, the Moon and \
solar system planets, given the date and observer's location."
LICENSE = "GPL-3.0-only"

PV = "1.8"

RPM_NAME = "wxEphe-1.8-1.2.aarch64.rpm"
RPM_HASH = "bae70244f2fc53229cf170b2cce671ca4ca8c594997bf2aae5975029a94dd7b1243c068db01416557cf9005814324c7ae037dbce14eb54905abb44877bf6b6f1"

RPROVIDES:${PN} += "application() \
application(wxEphe.desktop) \
wxEphe \
wxEphe(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libwx_baseu-suse.so.9.0.0()(64bit) \
libwx_baseu_xml-suse.so.9.0.0()(64bit) \
libwx_gtk2u_core-suse.so.9.0.0()(64bit)"

inherit rpm
