SUMMARY = "A Bible study tool"
DESCRIPTION = "BibleTime is a Bible study program. \
 \
The software uses the SWORD programming library to work with over 200 free \
Bible texts, commentaries, dictionaries and books provided by the Crosswire \
Bible Society. \
 \
BibleTime provides easy handling of digitalized texts (Bibles, commentaries and \
lexicons) and powerful features to work with these texts (search in texts, \
write own notes, save, print etc.)."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.3"

RPM_NAME = "bibletime-3.0.3-1.8.aarch64.rpm"
RPM_HASH = "d56edfcbff862ca30debfadc6a9f7402fd23b3450ade9afd52298541aea41b7b9591ed9073fa73fd4783326bc2c578997ba9ed337103af3435627e90901d0fb8"

RPROVIDES:${PN} += "bibletime"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickWidgets.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libclucene-core.so.1 \
libclucene-shared.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libsword-1.8.1.so"

inherit rpm
