SUMMARY = "Translations for package gcdemu"
DESCRIPTION = "Provides translations for the 'gcdemu' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.6"

RPM_NAME = "gcdemu-lang-3.2.6-1.4.noarch.rpm"
RPM_HASH = "d1912a81f93e66b9151371dc6a090483be6cdc118901da6efb62ad1ec8da872c492d294d559125309234ab65f085f3f05e7e87d4cce3778929be7898e78a30cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcdemu-lang \
gcdemu-lang-all \
locale(gcdemu:de) \
locale(gcdemu:fr) \
locale(gcdemu:ko) \
locale(gcdemu:pl) \
locale(gcdemu:pt_BR) \
locale(gcdemu:ru) \
locale(gcdemu:sl) \
locale(gcdemu:sv) \
locale(gcdemu:zh_CN)"
RDEPENDS:${PN} += "gcdemu"

inherit rpm
