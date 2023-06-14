SUMMARY = "LeechCraft Summary info Module"
DESCRIPTION = "This package provides a summary plugin for LeechCraft which shows a \
quick overview of LeechCraft's state. It shows current tasks like \
leeching or seeding torrents and downloading files with \
context-dependent actions and views. It also can collect status \
information from other plugins like unread channels. \
 \
Summary also allows to perform searches via the installed plugins \
like SeekThru or HistoryHolder. \
 \
Features: \
 * List of current tasks and events with context-dependent actions \
and views for selected items. \
 * Support for gathering status information from other plugins. \
 * Category-based search query support via other plugins."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-summary-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "14ef95ab8b7c3f80efb8966d2a3eda388dadb5665a2a31d63420395ac9948e857dc5d10fdde9345864ac7dd5e5eec0a7e835cdc25e917c99d5536236f9e1bea4"

RPROVIDES:${PN} += "leechcraft-summary \
leechcraft-summaryrepresentation \
libleechcraft-summary.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-gui-qt5.so.0.6.75.1 \
libleechcraft-util-models-qt5.so.0.6.75.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-tags-qt5.so.0.6.75.1 \
libstdc++.so.6"

inherit rpm
