SUMMARY = "Tool for importing mbox archives into akonadi"
DESCRIPTION = "This package contains a tool that can be used to import mbox archives \
into akonadi."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "mbox-importer-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "c18154634cea646b06dd7881113f6e1ac3fa1bdbf21d519dc1c412317d55ee8bd089ff4525f7be1214e1ae102d82aa670e691307d94a4a9f3b110ea013a07ef4"

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
