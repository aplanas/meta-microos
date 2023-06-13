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

RPROVIDES:${PN} += "application() \
application(info.bibletime.BibleTime.desktop) \
bibletime \
bibletime(aarch-64) \
metainfo() \
metainfo(info.bibletime.BibleTime.metainfo.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5QuickWidgets.so.5()(64bit) \
libQt5QuickWidgets.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libclucene-core.so.1()(64bit) \
libclucene-shared.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libsword-1.8.1.so()(64bit)"

inherit rpm
