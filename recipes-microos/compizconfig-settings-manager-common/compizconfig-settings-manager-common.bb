SUMMARY = "Settings Manager for Compiz -- Common files"
DESCRIPTION = "Common files for the Compiz Config and Settings tool (CCSM)."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "compizconfig-settings-manager-common-0.8.18-2.10.noarch.rpm"
RPM_HASH = "2bd8b099abf71ec50efcd0b90efc041e627610294c89bfba5b841e61503f8b5eab7b7e90ee1fe9796839a8eb830e466d5c6e34ccd1c67202ec472bbe91eae2c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "compizconfig-settings-manager-common"
RDEPENDS:${PN} += ""

inherit rpm
