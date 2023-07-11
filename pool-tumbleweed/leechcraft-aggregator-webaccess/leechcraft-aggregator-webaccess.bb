SUMMARY = "LeechCraft Aggregator Web Interface Module"
DESCRIPTION = "WebAccess provides a basic web interface for the \
Aggregator feed reader, so one can read news \
articles from a mobile device or another machine."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-aggregator-webaccess-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "fabcf6a9d82a11605915f202438f7c87aa00d6ff8dcb711e9c3a295a0a04c85a80699ecdde7575aeb4ed4205d1f6534f669dd618700389296fdc9953889ec32a"

RPROVIDES:${PN} += "leechcraft-aggregator-webaccess \
libleechcraft-aggregator-webaccess.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-aggregator \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-models-qt5.so.0.6.75.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-util-xsd-qt5.so.0.6.75 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6 \
libwt.so.4.8.1 \
libwthttp.so.4.8.1"

inherit rpm
