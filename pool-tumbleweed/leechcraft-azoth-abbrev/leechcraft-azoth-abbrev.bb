SUMMARY = "LeechCraft Azoth Abbreviations Module"
DESCRIPTION = "This package provides abbreviations via commands like /abbrev, /unabbrev \
and /listabbrevs for LeechCraft Azoth."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-abbrev-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "f3825c992a87f6957e90b865e34dbe1fe54b407f28a1a4cf3d19767c2ba805e61f66d7c9a587c2dbd09035526ca70d8e62d011fc5294655ef7ae098af2135bc9"

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
