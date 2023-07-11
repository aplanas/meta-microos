SUMMARY = "Translations for package lxqt-session"
DESCRIPTION = "Provides translations for the 'lxqt-session' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "lxqt-session-lang-1.3.0-1.2.noarch.rpm"
RPM_HASH = "81c102e81c0a8a054419c918cca1229305612a50b1aa58047cefa4d19f3bcc256437104ba7fe13bd12743814e3aa85b3ccb5c00e76a85a21456e43a0e88007e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-session-lang \
lxqt-session-lang-all"

RDEPENDS:${PN} += "lxqt-session"

inherit rpm
