SUMMARY = "Architecture independent data for Battle for Wesnoth"
DESCRIPTION = "This package contains the game data for Battle For Wesnoth. \
It is required to play the game."
LICENSE = "EPL-1.0 & GPL-2.0-or-later"

PV = "1.17.16"

RPM_NAME = "wesnoth-data-1.17.16-1.2.noarch.rpm"
RPM_HASH = "a3458562dbcccd59ae0ca0c10dab50d192def70be594d1d20bfe71aacad297550687028b2779c53ae627ab01ff3a6e53d627af4e76d082be13812851a58ef33d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wesnoth-data"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
wesnoth-fslayout"

inherit rpm
