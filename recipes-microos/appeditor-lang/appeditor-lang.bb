SUMMARY = "Translations for package appeditor"
DESCRIPTION = "Provides translations for the 'appeditor' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.3"

RPM_NAME = "appeditor-lang-1.1.3-2.4.noarch.rpm"
RPM_HASH = "c78eb74e0af4fb3bb213a79920227f39f16336c0b63e1728f39c04f238942c3c9c108d5982571bdb0ebbdf5fb40e56d3b5e5b9ecf8855cdc64a999c58c2896eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "appeditor-lang \
appeditor-lang-all \
locale(appeditor:ca) \
locale(appeditor:de) \
locale(appeditor:es) \
locale(appeditor:fr) \
locale(appeditor:it) \
locale(appeditor:ja) \
locale(appeditor:lt) \
locale(appeditor:pt) \
locale(appeditor:pt_BR) \
locale(appeditor:ru) \
locale(appeditor:tr)"
RDEPENDS:${PN} += "appeditor"

inherit rpm
