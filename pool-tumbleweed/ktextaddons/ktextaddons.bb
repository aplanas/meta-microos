SUMMARY = "Various text handling addons"
DESCRIPTION = "KTextAddons provides libraries to work with texts, such as grammar checks, \
text to speech, or translations."
LICENSE = "LGPL-2.0-or-later & GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "ktextaddons-1.4.1-1.1.aarch64.rpm"
RPM_HASH = "efbd69f3df5dfe79bb9681778026a9e285c7c8edfc4c57dd33a53d69a57245a5bed4ea1734fbc6f25a536013b9f90257db2cc1afeafb6dabffe28ce98f689a19"

RPROVIDES:${PN} += "ktextaddons"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5I18n.so.5 \
libKF5TextAddonsWidgets.so.1 \
libKF5TextTranslator.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libqt5keychain.so.1 \
libstdc++.so.6"

inherit rpm
