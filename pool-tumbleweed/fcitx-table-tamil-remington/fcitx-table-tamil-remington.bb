SUMMARY = "Tamil Remington tables for Fcitx"
DESCRIPTION = "Fcitx Tamil Remington tables"
LICENSE = "SUSE-Public-Domain"

PV = "0.2.4"

RPM_NAME = "fcitx-table-tamil-remington-0.2.4-2.5.noarch.rpm"
RPM_HASH = "63e150dbe88160a943ca4ecdbe6bd0e95585bd628273982eddaf82b6e3894fe3e7dfee2c0609f59451f0c0bfb742aac4477a2a2552a886786008b6be40a9a6d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-other \
fcitx-table-tamil-remington"
RDEPENDS:${PN} += "fcitx-table"

inherit rpm
