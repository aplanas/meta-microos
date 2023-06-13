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

RPM_NAME = "leechcraft-aggregator-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "581f5971653d6fd7bb630cfbc32dd80f21f963e4baf6a3a796291685d5d57bae866c1b602caaf8f3059fc06a29d9eff4c3f0c72dc1478f3fce1c97f51d02d72e"

RPROVIDES:${PN} += "leechcraft-aggregator \
leechcraft-aggregator(aarch-64) \
libleechcraft_aggregator.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
leechcraft \
leechcraft-http \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5Sql5-sqlite \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libleechcraft-util-db-qt5.so.0.6.75.1()(64bit) \
libleechcraft-util-gui-qt5.so.0.6.75.1()(64bit) \
libleechcraft-util-models-qt5.so.0.6.75.1()(64bit) \
libleechcraft-util-qt5.so.0.6.75()(64bit) \
libleechcraft-util-shortcuts-qt5.so.0.6.75()(64bit) \
libleechcraft-util-sll-qt5.so.0.6.75.1()(64bit) \
libleechcraft-util-sys-qt5.so.0.6.75.1()(64bit) \
libleechcraft-util-tags-qt5.so.0.6.75.1()(64bit) \
libleechcraft-util-threads-qt5.so.0.6.75()(64bit) \
libleechcraft-util-xpc-qt5.so.0.6.75.2()(64bit) \
libleechcraft-xsd-qt5.so.0.6.75.2()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
