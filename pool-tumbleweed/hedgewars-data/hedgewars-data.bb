SUMMARY = "Game data files for Hedgewars, a turn-based artillery game"
DESCRIPTION = "Hedgewars is a turn-based artillery game where slow-moving hedgehocks fight \
each other with over-the-top weaponary. It can be played both online and \
rotational on the same computer. \
 \
This package contains all the data files for hedgewars."
LICENSE = "GPL-2.0-only"

PV = "1.0.2"

RPM_NAME = "hedgewars-data-1.0.2-1.9.noarch.rpm"
RPM_HASH = "52401d2b5a87cf3e160ac91cedadfc7babe7a356ecbfbed35a44cf06cf00aa531d0bea046310f772e894aef18eec8f23bde872fb336c4306beeca468e616a21c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hedgewars-data"

RDEPENDS:${PN} += "hedgewars"

inherit rpm
