SUMMARY = "Yaru sound theme"
DESCRIPTION = "This is the theme shaped by the community on the Ubuntu hub. \
 \
This package contains the sound theme following the XDG theming \
specification."
LICENSE = "CC-BY-SA-4.0"

PV = "20.10.6.1"

RPM_NAME = "sound-theme-yaru-20.10.6.1-1.6.noarch.rpm"
RPM_HASH = "436131b2ad5ebd2503c958ec3bfa9988c0d488dd660eaa1dfe12cbda1ea36b20656f85f88e00d26ccd2154bd6576b972c1b6c765defbc19a10f4249aec67c58f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sound-theme-yaru"

RDEPENDS:${PN} += ""

inherit rpm
