SUMMARY = "LeechCraft OpenSearch Module"
DESCRIPTION = "This package contains an OpenSearch plugin for LeechCraft \
which provides a search client for OpenSearch-enabled web sites and engines. \
 \
Features: \
 * Support for autodiscovery of OpenSearch-capable web sites. \
 * Tagging of search engines. \
 * Support for queries to several search engines at once. \
 * Support search results in RSS/Atom format and subscribe to them \
with a suitable plugin like Aggregator. \
 * Show results in HTML format with a suitable plugin like Poshuku."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-seekthru-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "664827474cce4da4465cf17f04b8e47b6b6bd72d475eea9dbc8aa4116eccc0335a93855c2adf71837f1cc1083c8e15c9268e821eb43bb41162f9b5235da7a7c5"

RPROVIDES:${PN} += "leechcraft-seekthru \
libleechcraft-seekthru.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-http \
leechcraft-summaryrepresentation \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-gui-qt5.so.0.6.75.1 \
libleechcraft-util-models-qt5.so.0.6.75.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-util-tags-qt5.so.0.6.75.1 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
