SUMMARY = "Translations for package deepin-daemon"
DESCRIPTION = "Provides translations for the 'deepin-daemon' package."
LICENSE = "GPL-3.0-or-later"

PV = "5.14.45"

RPM_NAME = "deepin-daemon-lang-5.14.45-2.3.aarch64.rpm"
RPM_HASH = "164217998e975e93b4b3e5569d57b659b40ce81b0120a9f181a666d483144b965c17e8f62d93a5caef4d1b9bab2617665a67559b68fc9fffa6e6a24466b47a79"

RPROVIDES:${PN} += "deepin-daemon-lang deepin-daemon-lang(aarch-64)"
RDEPENDS:${PN} += "deepin-daemon"

inherit rpm
