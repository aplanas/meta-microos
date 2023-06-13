SUMMARY = "Tool for importing mbox archives into akonadi"
DESCRIPTION = "This package contains a tool that can be used to import mbox archives \
into akonadi."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "mbox-importer-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "9f7b7e5e888fba305ad4d0f403dc140e3aaf5f35412dbaa601ef7155dc5d716574304f210fae7f80fe399e175ad123b2398fb4037a11ae2fa40913bd2f506f7f"

RPROVIDES:${PN} += "application() \
application(org.kde.mboximporter.desktop) \
mbox-importer \
mbox-importer(aarch-64) \
mimehandler(application/mbox)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKPim5AkonadiCore.so.5()(64bit) \
libKPim5IdentityManagement.so.5()(64bit) \
libKPim5MailCommon.so.5()(64bit) \
libKPim5MailImporter.so.5()(64bit) \
libKPim5MailImporterAkonadi.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
