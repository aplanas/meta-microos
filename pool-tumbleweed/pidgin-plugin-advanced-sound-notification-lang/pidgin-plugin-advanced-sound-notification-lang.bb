SUMMARY = "Translations for package pidgin-plugin-advanced-sound-notification"
DESCRIPTION = "Provides translations for the 'pidgin-plugin-advanced-sound-notification' package."
LICENSE = "GPL-2.0+"

PV = "1.2.1"

RPM_NAME = "pidgin-plugin-advanced-sound-notification-lang-1.2.1-11.25.noarch.rpm"
RPM_HASH = "862a60f3b843182fa98e2a2ae2211af66179b0316ecce09648eb846d8ff553d4325a2eb65b602a1d2365cc29d589bfe05f1c5432c5867d2d801b3515d8329a6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pidgin-plugin-advanced-sound-notification-de \
locale-pidgin-plugin-advanced-sound-notification-es \
locale-pidgin-plugin-advanced-sound-notification-fr \
locale-pidgin-plugin-advanced-sound-notification-ru \
locale-pidgin-plugin-advanced-sound-notification-tr \
locale-pidgin-plugin-advanced-sound-notification-zh-CN \
pidgin-plugin-advanced-sound-notification-lang \
pidgin-plugin-advanced-sound-notification-lang-all"

RDEPENDS:${PN} += "pidgin-plugin-advanced-sound-notification"

inherit rpm
