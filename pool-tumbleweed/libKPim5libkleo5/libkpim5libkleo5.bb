SUMMARY = "LibKleo library for kdepim"
DESCRIPTION = "This package contains the libkleo library, a library used by KDE PIM \
applications to handle cryptographic key and certificate management."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libKPim5libkleo5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "6420886d92fe55cf727a7d5b306e0cd80e16eccc108dc6b85a06a0aa8d9b723a3f840dc0055964a6449fee4b6147a520d4a91ab3f096ddb9e13fd248e07d1b7e"

RPROVIDES:${PN} += "libKPim5Libkleo.so.5 \
libKPim5libkleo5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Codecs.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5ItemModels.so.5 \
libKF5WidgetsAddons.so.5 \
libKPim5TextEdit.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libgpgme.so.11 \
libgpgmepp.so.6 \
libkleo \
libqgpgme.so.15 \
libstdc++.so.6"

inherit rpm
