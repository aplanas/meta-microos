SUMMARY = "MATE Weather common files"
DESCRIPTION = "libmateweather is a library to access weather information from \
online services for numerous locations."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.26.1"

RPM_NAME = "mateweather-common-1.26.1-1.1.noarch.rpm"
RPM_HASH = "34800682e4d4481124804f6c79384469e584d291b8057fafc48c248c4fe087dd6e9d4558ce577b82fc3183f3143bbd7f6a1703ff2d174ecc428ae7611b5d8ed9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mateweather-common"

RDEPENDS:${PN} += ""

inherit rpm
