SUMMARY = "Color profiles for colord"
DESCRIPTION = "colord is a system activated daemon that maps devices to color profiles. \
It is used by gnome-color-manager for system integration and use when \
there are no users logged in. \
 \
This package provides color profiles previously provided by shared-color-profiles"
LICENSE = "GPL-2.0-or-later"

PV = "1.4.6"

RPM_NAME = "colord-color-profiles-1.4.6-3.1.aarch64.rpm"
RPM_HASH = "c52dc9cad700e5572dceba918a8ae9d450843b3fedac36c3a6bb4a739c1e7b798bafdb4386b20d1b732711d2858672309e614b8cb99d8586c56f4af5a058019a"

RPROVIDES:${PN} += "colord-color-profiles \
shared-color-profiles"

RDEPENDS:${PN} += ""

inherit rpm
