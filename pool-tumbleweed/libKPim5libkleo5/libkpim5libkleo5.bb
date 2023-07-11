SUMMARY = "LibKleo library for kdepim"
DESCRIPTION = "This package contains the libkleo library, a library used by KDE PIM \
applications to handle cryptographic key and certificate management."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libKPim5libkleo5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "6af5eeda8d9e6e6cc00c79333904a0790f8c717b38decbbc61801abe3da3707c9bbbb2d8cfeb5c098cea72177e5975468be3ab3649912cb163cdbba5e9205d1d"

RPROVIDES:${PN} += "libKPim5Libkleo.so.5 \
libKPim5libkleo5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Codecs.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
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
