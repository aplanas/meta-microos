SUMMARY = "Graphics, music, cars and tracks for Ultimate Stunts"
DESCRIPTION = "This package contains the game data for Ultimate Stunts. \
 \
Ultimate Stunts is a remake of the famous DOS game 'Stunts'. Racing in \
Ultimate Stunts involves some really spectacular stunts, like \
loopings, corkscrews, bridges to jump over, etc. You can also design \
your own tracks."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.7.1"

RPM_NAME = "ultimatestunts-data-0.7.7.1-2.3.noarch.rpm"
RPM_HASH = "798efc2d640bf91b5f3e1a220cb2595ba4c93a3a76bb29a65c4b929642f3cd515d969bb078fc3539338caa7999d108bbc2dcb5511734057a88504115179ea44b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ultimatestunts-data"

RDEPENDS:${PN} += ""

inherit rpm
