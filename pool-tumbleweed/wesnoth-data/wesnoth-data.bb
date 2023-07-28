SUMMARY = "Architecture independent data for Battle for Wesnoth"
DESCRIPTION = "This package contains the game data for Battle For Wesnoth. \
It is required to play the game."
LICENSE = "EPL-1.0 & GPL-2.0-or-later"

PV = "1.17.17"

RPM_NAME = "wesnoth-data-1.17.17-1.1.noarch.rpm"
RPM_HASH = "e803002b90f232f5af11a2faaab91c27533da10e16e0d0d0def15926cfab92da4b4a4dbd89aa237e3f8f4928e4684e7bb2037b7769569ba2c6553639b1646c89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wesnoth-data"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
wesnoth-fslayout"

inherit rpm
