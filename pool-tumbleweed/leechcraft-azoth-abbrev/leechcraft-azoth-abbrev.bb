SUMMARY = "LeechCraft Azoth Abbreviations Module"
DESCRIPTION = "This package provides abbreviations via commands like /abbrev, /unabbrev \
and /listabbrevs for LeechCraft Azoth."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-abbrev-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "0e9ffdfad2aab9daadff61556b359dc26112e56459d0b0d08ff2a4ca2e1eeecbd535b3c82396f84acac82df1eba499928eac5f56cc5ea500e39b4b6f6fae1793"

RPROVIDES:${PN} += "leechcraft-azoth-abbrev \
libleechcraft-azoth-abbrev.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth-protocolplugin \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libstdc++.so.6"

inherit rpm
