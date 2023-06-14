SUMMARY = "Tool for importing mbox archives into akonadi"
DESCRIPTION = "This package contains a tool that can be used to import mbox archives \
into akonadi."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "mbox-importer-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "9f7b7e5e888fba305ad4d0f403dc140e3aaf5f35412dbaa601ef7155dc5d716574304f210fae7f80fe399e175ad123b2398fb4037a11ae2fa40913bd2f506f7f"

RPROVIDES:${PN} += "mbox-importer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5I18n.so.5 \
libKF5WidgetsAddons.so.5 \
libKPim5AkonadiCore.so.5 \
libKPim5IdentityManagement.so.5 \
libKPim5MailCommon.so.5 \
libKPim5MailImporter.so.5 \
libKPim5MailImporterAkonadi.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
