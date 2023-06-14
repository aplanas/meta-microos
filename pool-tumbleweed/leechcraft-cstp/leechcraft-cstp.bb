SUMMARY = "LeechCraft HTTP Module"
DESCRIPTION = "This package provides a HTTP implementation plugin for LeechCraft \
which will mainly used by many other plugins like Aggregator or \
SeekThru. \
 \
Features: \
 * Support for redirects. \
 * Automatic downloads from other plugins. \
 * Support for continuing interrupted downloads."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-cstp-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "5c84a669ce73d5f9d9c0facd9eda07b7e3ce294da86f160b2121cbc4b9f9065e540d41438987c2580686cd01a0794422f300321588557a9a18a8f4fcbf0cf53a"

RPROVIDES:${PN} += "leechcraft-cstp \
leechcraft-http \
libleechcraft-cstp.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
