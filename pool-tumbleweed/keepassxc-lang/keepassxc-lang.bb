SUMMARY = "Translations for package keepassxc"
DESCRIPTION = "Provides translations for the 'keepassxc' package."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "2.7.5"

RPM_NAME = "keepassxc-lang-2.7.5-1.2.noarch.rpm"
RPM_HASH = "f4bf0554a2701c2e603b8620183bc4e8ee0ac0b11729843053e10257ed277f8a584e1312151880177a4959d42748e437f7d2e9b02eb4d5e4b7e621542ba1a0bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keepassxc-lang \
keepassxc-lang-all"

RDEPENDS:${PN} += "keepassxc"

inherit rpm
