SUMMARY = "Word Processor"
DESCRIPTION = "Words is the word processor application of the Calligra Suite."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.1"

RPM_NAME = "calligra-words-3.2.1-7.17.aarch64.rpm"
RPM_HASH = "50794938bb6743b0d1be61a4e9e5050445e6edeb7ded3066c52b2a3a879831f4452d27552fa0775f1feaa571a172107aba1ebfb64bdfdccc6968e6c18fed5723"

RPROVIDES:${PN} += "application() \
application(org.kde.calligrawords.desktop) \
application(org.kde.calligrawords_ascii.desktop) \
calligra-words \
calligra-words(aarch-64) \
calligra-words-common \
libRtfReader.so.17()(64bit) \
libkdeinit5_calligrawords.so()(64bit) \
libkowv2.so.9()(64bit) \
libwordsprivate.so.17()(64bit) \
metainfo() \
metainfo(org.kde.calligrawords.appdata.xml) \
mimehandler(application/msword) \
mimehandler(application/rtf) \
mimehandler(application/vnd.ms-works) \
mimehandler(application/vnd.oasis.opendocument.text) \
mimehandler(application/vnd.oasis.opendocument.text-master) \
mimehandler(application/vnd.oasis.opendocument.text-template) \
mimehandler(application/vnd.openxmlformats-officedocument.wordprocessingml.document) \
mimehandler(application/vnd.openxmlformats-officedocument.wordprocessingml.template) \
mimehandler(application/vnd.wordperfect) \
mimehandler(application/x-mswrite) \
mimehandler(text/plain)"

RDEPENDS:${PN} += "/sbin/ldconfig \
calligra \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5Codecs.so.5()(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IconThemes.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libflake.so.17()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libkomain.so.17()(64bit) \
libkomsooxml.so.17()(64bit) \
libkoodf.so.17()(64bit) \
libkoodf2.so.17()(64bit) \
libkoodfreader.so.17()(64bit) \
libkostore.so.17()(64bit) \
libkotext.so.17()(64bit) \
libkotextlayout.so.17()(64bit) \
libkovectorimage.so.17()(64bit) \
libkoversion.so.17()(64bit) \
libkowidgets.so.17()(64bit) \
libkowidgetutils.so.17()(64bit) \
libkundo2.so.17()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libodfgen-0.1.so.1()(64bit) \
librevenge-0.0.so.0()(64bit) \
librevenge-stream-0.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.1)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libwpd-0.10.so.10()(64bit) \
libwpg-0.3.so.3()(64bit) \
libwps-0.4.so.4()(64bit) \
libz.so.1()(64bit)"

inherit rpm
