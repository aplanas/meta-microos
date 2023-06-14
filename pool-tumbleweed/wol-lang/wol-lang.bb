SUMMARY = "Translations for package wol"
DESCRIPTION = "Provides translations for the 'wol' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.1"

RPM_NAME = "wol-lang-0.7.1-162.20.noarch.rpm"
RPM_HASH = "90b8a2b9394dab95238611dad26035fb9a9a7768dffbd3eb98daea732f83fa02f83667609e3e4c96a5de6ac5c2e27372726473ba354a708293d68868601e1793"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-wol-de \
locale-wol-es \
locale-wol-fr \
locale-wol-it \
locale-wol-sv \
wol-lang \
wol-lang-all"

RDEPENDS:${PN} += "wol"

inherit rpm
