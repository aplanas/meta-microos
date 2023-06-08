SUMMARY = "Color profiles for colord"
DESCRIPTION = "colord is a system activated daemon that maps devices to color profiles. \
It is used by gnome-color-manager for system integration and use when \
there are no users logged in. \
 \
This package provides color profiles previously provided by shared-color-profiles"
LICENSE = "GPL-2.0-or-later"

PV = "1.4.6"

RPM_NAME = "colord-color-profiles-1.4.6-2.3.aarch64.rpm"
RPM_HASH = "2d78fc57a2e070958e6c67f225c81e91127f6ae6d58107eccef8196285b1f03cac384fb9e0165fd261c1b296541cec615ad7ddaaeded82789e999b3c10b67da3"

RPROVIDES:${PN} += "colord-color-profiles colord-color-profiles(aarch-64) shared-color-profiles"
RDEPENDS:${PN} += ""

inherit rpm
