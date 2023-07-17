SUMMARY = "YaST2 - Portuguese Translations"
DESCRIPTION = "YaST2 - Translations for Portuguese."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-pt-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "811a280552193a3944699d6ce0102fe90a186eb75d987960839348a3ee7d200baeed71bb945a59ea1d2bf33d58cafdf6f7ad22c64d0ed31306e5e1d2e12e4305"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-pt \
yast2-trans-pt"

RDEPENDS:${PN} += ""

inherit rpm
