SUMMARY = "LeechCraft Poshuku Greasemonkey Module"
DESCRIPTION = "This package provides a Greasemonkey script plugin for LeechCraft Poshuku. \
These scripts could be used for \
adding new features to web pages (for example, embedding price comparisons \
within shopping sites), fixing rendering bugs, combining data from multiple \
webpages, and numerous other purposes. \
 \
This plugin supports almost all of the GreaseMonkey API and is compatible \
with most userscripts present 'in the wild'. \
 \
FatApe usage is documented on the corresponding user guide page."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-poshuku-fatape-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "55a8e3f0535929109a2499e5e30566c410342154b36ce8845d35f3f8d5ff0a4c273abaf95675d3c88a871e081a461d07beb08981e9a635280e59d299414110a9"

RPROVIDES:${PN} += "leechcraft-poshuku-fatape \
libleechcraft-poshuku-fatape.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-poshuku \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
