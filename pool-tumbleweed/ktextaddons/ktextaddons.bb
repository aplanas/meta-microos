SUMMARY = "Various text handling addons"
DESCRIPTION = "KTextAddons provides libraries to work with texts, such as grammar checks, \
text to speech, or translations."
LICENSE = "LGPL-2.0-or-later & GPL-2.0-or-later"

PV = "1.1.0"

RPM_NAME = "ktextaddons-1.1.0-1.1.aarch64.rpm"
RPM_HASH = "cbade21e68b61c91a01385303c9744b894245094a1cad2798184f96ffa52e7c2a23a1a701019aa7af67149e143b136dbede945abd310ef416ea3d5f6555103ad"

RPROVIDES:${PN} += "ktextaddons"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5I18n.so.5 \
libKF5TextTranslator.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libqt5keychain.so.1 \
libstdc++.so.6"

inherit rpm
