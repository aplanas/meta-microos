SUMMARY = "LeechCraft RSS/Atom Aggregator Module"
DESCRIPTION = "This package provides a RSS/Atom feed reader plugin for LeechCraft. \
 \
It features: \
 * RSS 0.92/0.93/1.0/2.0, Atom 0.3/1.0; \
 * extensions like GeoRSS, MediaRSS, Comment API etc; \
 * OPML support; \
 * broadcatching and fetching arbitrary data with regexps; \
 * tape mode for news display; \
 * individual options for each channel like update interval; \
 * storage either in SQLite or PostgreSQL; \
 * exporting feeds to FB2 for further reading on handheld devices. \
 \
A web browser plugin is recommended to show the news in a fancy way."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-aggregator-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "3432ea395e362451ed3fd0f5b68d7fb043a14d87e109e6ca66b13f241dfa4dbfca10ade1fd5d364cd5511bc8cc79c9cd2acda6d192f80c3c905789403299d6ed"

RPROVIDES:${PN} += "leechcraft-aggregator \
libleechcraft-aggregator.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-http \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Sql.so.5 \
libQt5Sql5-sqlite \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-db-qt5.so.0.6.75.1 \
libleechcraft-util-gui-qt5.so.0.6.75.1 \
libleechcraft-util-models-qt5.so.0.6.75.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-shortcuts-qt5.so.0.6.75 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-util-tags-qt5.so.0.6.75.1 \
libleechcraft-util-threads-qt5.so.0.6.75 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
