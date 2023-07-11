SUMMARY = "Translations for package starfighter"
DESCRIPTION = "Provides translations for the 'starfighter' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.4"

RPM_NAME = "starfighter-lang-2.4-1.14.noarch.rpm"
RPM_HASH = "32e7f94c9e9b5a58e908ee67cf92654621fbc268aefc268091e4fbd1205d008619ac70f1fd04561b36da2d047eb30ffb3dfac5e295a93c58b0d778121b0d677f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-starfighter-en \
locale-starfighter-ja \
locale-starfighter-nl \
starfighter-lang \
starfighter-lang-all"

RDEPENDS:${PN} += "starfighter"

inherit rpm
