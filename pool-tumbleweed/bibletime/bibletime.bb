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

RPM_NAME = "bibletime-3.0.3-1.7.aarch64.rpm"
RPM_HASH = "c33181fbaaa5e7e978b16d8b0194648080c9b9bffc109fd013a7c56ef073b5fdf0202bb222051d2cdb3cdee7ffea03e6498a2714ebf95886d32bca80e163a62b"

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
