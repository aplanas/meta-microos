SUMMARY = "Various text handling addons"
DESCRIPTION = "KTextAddons provides libraries to work with texts, such as grammar checks, \
text to speech, or translations."
LICENSE = "LGPL-2.0-or-later & GPL-2.0-or-later"

PV = "1.1.0"

RPM_NAME = "ktextaddons-1.1.0-1.1.aarch64.rpm"
RPM_HASH = "cbade21e68b61c91a01385303c9744b894245094a1cad2798184f96ffa52e7c2a23a1a701019aa7af67149e143b136dbede945abd310ef416ea3d5f6555103ad"

RPROVIDES:${PN} += "ktextaddons \
ktextaddons(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5TextTranslator.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libqt5keychain.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
