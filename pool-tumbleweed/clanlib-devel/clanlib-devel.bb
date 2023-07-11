SUMMARY = "A portable interface for writing games"
DESCRIPTION = "ClanLib delivers a platform independent interface to write games with."
LICENSE = "Zlib"

PV = "4.1.0"

RPM_NAME = "clanlib-devel-4.1.0-2.11.aarch64.rpm"
RPM_HASH = "d2b73fb05279d82cffc50e5012f286dc471d2a52412cf0af631297e8493206185b62a9c822b0956f43165eba16084b196de600565df1b8e31724e7ac312fd262"

RPROVIDES:${PN} += "clanlib-devel \
pkgconfig-clanApp-4.1 \
pkgconfig-clanCore-4.1 \
pkgconfig-clanDisplay-4.1 \
pkgconfig-clanGL-4.1 \
pkgconfig-clanNetwork-4.1 \
pkgconfig-clanSound-4.1 \
pkgconfig-clanUI-4.1 \
pkgconfig-clanXML-4.1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
c++-compiler \
clanlib \
pkgconfig-alsa \
pkgconfig-fontconfig \
pkgconfig-gl \
pkgconfig-x11"

inherit rpm
