SUMMARY = "Game data files for Hedgewars, a turn-based artillery game"
DESCRIPTION = "Hedgewars is a turn-based artillery game where slow-moving hedgehocks fight \
each other with over-the-top weaponary. It can be played both online and \
rotational on the same computer. \
 \
This package contains all the data files for hedgewars."
LICENSE = "GPL-2.0-only"

PV = "1.0.2"

RPM_NAME = "hedgewars-data-1.0.2-1.7.noarch.rpm"
RPM_HASH = "f6cab441ebff1cf8baafe4c54c53b5410f18a3f13082a18c243617ec8c6699a0b5913f94f7156f3c6f38ef2a828ad0fd815071355ae3258123111a7ceaaf3ce0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hedgewars-data"

RDEPENDS:${PN} += "hedgewars"

inherit rpm
