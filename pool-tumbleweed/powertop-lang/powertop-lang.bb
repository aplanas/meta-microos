SUMMARY = "Translations for package powertop"
DESCRIPTION = "Provides translations for the 'powertop' package."
LICENSE = "GPL-2.0-only"

PV = "2.15"

RPM_NAME = "powertop-lang-2.15-1.4.noarch.rpm"
RPM_HASH = "86eed5b88ffdcb15671bccbdebc9d0820b540d433dcf16e9c6f36ef6297fe6efd677aabf415d39919cc78d553d9587623e4f2decebadca7aaf608db8b05ec090"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-powertop-ca \
locale-powertop-cs-CZ \
locale-powertop-de-DE \
locale-powertop-en-GB \
locale-powertop-en-US \
locale-powertop-es-ES \
locale-powertop-zh-TW \
powertop-lang \
powertop-lang-all"

RDEPENDS:${PN} += "powertop"

inherit rpm
