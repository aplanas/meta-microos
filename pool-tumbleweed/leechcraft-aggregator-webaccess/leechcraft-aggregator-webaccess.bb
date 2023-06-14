SUMMARY = "LeechCraft Aggregator Web Interface Module"
DESCRIPTION = "WebAccess provides a basic web interface for the \
Aggregator feed reader, so one can read news \
articles from a mobile device or another machine."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-aggregator-webaccess-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "54da2b12da4a2f381f388a93b94ac327c67e4db56873b641f2a70a6a3d4ba0cfc39d0b6bc3b14258e7b05cfa62034de64ab206a9e59407b15991fc6292f4f7cb"

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
