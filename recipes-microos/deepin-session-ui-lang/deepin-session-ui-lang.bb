SUMMARY = "Translations for package deepin-session-ui"
DESCRIPTION = "Provides translations for the 'deepin-session-ui' package."
LICENSE = "GPL-3.0-or-later"

PV = "5.5.24"

RPM_NAME = "deepin-session-ui-lang-5.5.24-1.3.noarch.rpm"
RPM_HASH = "622048bf0624ebed11cbf1b9a4f8aee2315d0f8f31604b584c4d0d3eb9f4232c143795ab787bab33a7e23ceca61bfc643657dfeb7ed1cab7fa1123e20b7ec932"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-session-ui-lang deepin-session-ui-lang-all"
RDEPENDS:${PN} += "deepin-session-ui"

inherit rpm
