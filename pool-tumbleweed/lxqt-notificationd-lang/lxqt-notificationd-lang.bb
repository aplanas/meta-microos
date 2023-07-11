SUMMARY = "Translations for package lxqt-notificationd"
DESCRIPTION = "Provides translations for the 'lxqt-notificationd' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "lxqt-notificationd-lang-1.3.0-1.2.noarch.rpm"
RPM_HASH = "04955715eec2d8f269be4fa62be8bb141387f54111587592bd075ddb2b0baec31d05211c4f7b5d95238da03cbeaf8ca912e1f6f7631cd5131d7ec124721dda6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-notificationd-lang \
lxqt-notificationd-lang-all"

RDEPENDS:${PN} += "lxqt-notificationd"

inherit rpm
